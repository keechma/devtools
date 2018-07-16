(ns keechma.devtools.ui.graph
  (:require
   [keechma.ui-component :as ui]
   [keechma.toolbox.css.core :refer-macros [defelement]]
   [keechma.devtools.util :refer [index-of]]
   [garden.color :as color]
   [goog.string :as gstring]
   [keechma.toolbox.ui :refer [<cmd sub>]]))

(defn generate-color-from-term [t]
  (let [term (name t)
        term-length (count term)
        modifier (* term-length term-length)
        hash-code (gstring/hashCode term) 
        term-hue (mod (+ modifier hash-code) 360)]
    (color/as-hex (color/hsl term-hue 100 35))))

(defn calculate-x [event controllers]
  (if (= :controller (:type event))
    (let [topic (:topic event)
          idx (index-of controllers topic)]
      (inc idx))
    0))

(defn build-current-controller-line [current-line idx x e]
  (if (:y1 current-line)
    (assoc current-line :y2 idx :ev2-id (:id e))
    {:key (:id e) :stroke-width 2 :stroke (generate-color-from-term (:topic e)) :x1 x :x2 x :y1 idx :ev1-id (:id e)}))

(defn main->controller-line-name [e]
  (let [topic (:topic e)
        type (:type e)
        ev-name (:name e)
        ev-payload (:payload e)]
    (case type
      :app (flatten [ev-name])
      :component (last ev-name)
      :controller (flatten [topic ev-name])
      nil)))

(defn calculate-controllers-verticals [events controllers]
  ;; Vertical lines connecting controller events (dashed)
  (reduce
   (fn [acc e]
     (let [type (:type e)
           idx (:idx e)]
       (if (= :controller type)
         (let [topic (:topic e)
               ev-name (:name e)
               start? (= [:lifecycle :start] ev-name)
               lines (get acc topic)
               prev-lines (if start? lines (drop-last lines))
               current-line (if start? {} (or (last lines) {}))
               x (calculate-x e controllers)]
           (assoc acc topic (conj (vec prev-lines) (build-current-controller-line current-line idx x e))))
         acc))) {} events))

(defn calculate-send-command-connectors [openers closers controllers]
  (reduce-kv
   (fn [acc _ e]
     (let [connector-key (:name e)
           opener (get openers (get-in e [:cmd-info :origin-id]))]
       (if (and opener
                (= :controller (:type e))
                (= :controller (:type opener)))
         (let [current-connectors (or (get acc connector-key) [])]
           (assoc acc connector-key
                  (conj current-connectors
                        {:x1 (calculate-x opener controllers)
                         :x2 (calculate-x e controllers)
                         :y1 (:idx opener)
                         :y2 (:idx e)
                         :ev1-id (:id opener)
                         :ev2-id (:id e)
                         :key (:id opener)
                         :sort-idx (:idx e)
                         :stroke-color-term (name (:topic opener))
                         :stroke (generate-color-from-term (:topic opener))})))
         acc)))
   {} closers))

(defn calculate-main->controllers-connectors [openers closers controllers]
  (reduce-kv
   (fn [acc _ e]
     (let [connector-key (main->controller-line-name e)
           opener (get openers (get-in e [:cmd-info :origin-id]))]
       (if (and opener
                (= :controller (:type e))
                (not= :controller (:type opener)))
         (let [current-connectors (or (get acc connector-key) [])]
           (assoc acc connector-key
                  (conj current-connectors
                        {:x1 0
                         :x2 (calculate-x e controllers)
                         :y1 (:idx opener)
                         :y2 (:idx e)
                         :ev1-id (:id opener)
                         :ev2-id (:id e)
                         :key (:id opener)
                         :stroke-color-term (name (:topic e))
                         :stroke (generate-color-from-term (:topic e))})))
         acc)))
   {} closers))

(defn signum [val]
  (if (neg? val) -1 1))

(defn make-connector-path [{:keys [x1 x2 y1 y2]}]
  (let [delta-factor 0.25
        delta-x (* delta-factor (- x2 x1))
        delta-y (* delta-factor (- y2 y1))
        delta 5

        x-diff (- x2 x1)
        y-diff (- y2 y1)

        arc-1 0
        arc-2 1]
    (str "M" x1 " " y1
         " H" (- x2 (* delta (signum delta-x)))
         " A" delta " " delta " 0 0 " (if (> x1 x2) arc-1 arc-2) " " x2 " " (+ y1 (* 1 delta))
         " V"  y2)))

(defn events->openers-closers [events]
  (reduce-kv
   (fn [acc idx e]
     (let [closer? (boolean (get-in e [:cmd-info :origin-id]))]
       (assoc-in acc [(if closer? :closers :openers) (:id e)] (assoc e :idx idx))))
   {:openers {} :closers {}} events))

(defn render-controller-verticals [events controllers {:keys [width-factor get-top stroke-width]}]
  (let [controller-verticals (flatten (vals (calculate-controllers-verticals events controllers)))]
    ;; Controller vertical lines
    [:g
     (map (fn [{:keys [x1 x2 y1 y2 key stroke ev1-id ev2-id]}]
            [:line {:key key
                    :x1 (+ (/ width-factor 2) (* width-factor x1))
                    :x2 (+ (/ width-factor 2) (* width-factor x2))
                    :y1 (get-top ev1-id)
                    :y2 (get-top ev2-id)
                    :stroke-width stroke-width
                    :stroke stroke
                    :stroke-dasharray "2"}])
          controller-verticals)]))

(defn render-send-command-arrows [openers closers controllers {:keys [width-factor get-top stroke-width]}]
  (let [send-command-arrows (sort-by :sort-idx (remove nil? (flatten (vals (calculate-send-command-connectors openers closers controllers)))))]
    ;; First we render command lines and white border around them
    (into
     [:g]
     (concat
      (reduce
       (fn [acc {:keys [x1 x2 y1 y2 key stroke stroke-color-term ev1-id ev2-id]}]
         (let [o {:d (make-connector-path {:x1 (+ (/ width-factor 2) (* width-factor x1))
                                           :x2 (+ (/ width-factor 2) (* width-factor x2))
                                           :y1 (get-top ev1-id)
                                           :y2 (get-top ev2-id)})
                  :key (str "white-" key)
                  :stroke "white"
                  :stroke-width (* 3 stroke-width)
                  :fill "transparent"}]
           (concat acc [[:path o]
                        [:path (assoc o
                                      :key key
                                      :stroke-width stroke-width
                                      :stroke stroke
                                      )]])))
       [] send-command-arrows)
      ;; After that we render the arrow elements so they're always on top
      (map
       (fn [{:keys [x1 x2 y1 y2 key stroke stroke-color-term ev1-id ev2-id]}]
         [:path {:d (make-connector-path {:x1 (+ (/ width-factor 2) (* width-factor x2))
                                          :x2 (+ (/ width-factor 2) (* width-factor x2))
                                          :y1 (- (get-top ev2-id) 10)
                                          :y2 (get-top ev2-id)})
                 :key (str "arrow-" key)
                 :stroke-width stroke-width
                 :marker-end (str "url(#arrow-" stroke-color-term ")")}])
       send-command-arrows)))))

(defn render-app->controllers-arrows [openers closers controllers {:keys [width-factor get-top stroke-width]}]
  (let [app->controllers-connectors (remove nil? (flatten (vals (calculate-main->controllers-connectors openers closers controllers))))]
    [:<>
     ;; White border on commands coming from the app
     [:g (doall (map (fn [{:keys [x1 x2 y1 y2 key stroke stroke-color-term ev1-id ev2-id]}]
                       [:path
                        {:d (make-connector-path {:x1 (/ width-factor 2)
                                                  :x2 (+ (/ width-factor 2) (* width-factor x2))
                                                  :y1 (get-top ev1-id)
                                                  :y2 (get-top ev2-id)})
                         :key key
                         :stroke "white"
                         :stroke-width (* 3 stroke-width)
                         :fill "transparent"}])
                     app->controllers-connectors))]
     
     ;; Commands coming from the app 
     [:g (doall (map (fn [{:keys [x1 x2 y1 y2 key stroke stroke-color-term ev1-id ev2-id]}]
                       [:path
                        {:d (make-connector-path {:x1 (/ width-factor 2)
                                                  :x2 (+ (/ width-factor 2) (* width-factor x2))
                                                  :y1 (get-top ev1-id)
                                                  :y2 (get-top ev2-id)})
                         :key key
                         :stroke "black"
                         :stroke-width stroke-width
                         :fill "transparent"
                         :marker-end (str "url(#arrow-black)")}])
                     app->controllers-connectors))]]))

(defn render [ctx app-events {:keys [height-factor width-factor stroke-width width]}]
  (let [events (:events app-events)
        {:keys [openers closers]} (events->openers-closers events)
        app-name (:name app-events)
        controllers (:controllers app-events)
        row-dimensions (sub> ctx :row-dimensions)
        get-top (fn [ev-id]
                  (+ 25 (or (get-in row-dimensions [app-name ev-id :y1]) 0)))
        height (or (apply max (map :y2 (vals (get row-dimensions app-name)))) 0)]
    [:svg {:height (str height "px")
           :width (str width "px")}
     [:defs
      [:marker {:id (str "arrow-black")
                :key (str "arrow-black")
                :orient "auto"
                :marker-width (* 1.5 stroke-width)
                :marker-height (* 3 stroke-width)
                :ref-x "5"
                :ref-y "3"}
       [:path {:d "M0,0 V6 L3,3 Z" :fill "black"}]]
      (map (fn [c]
             [:marker {:id (str "arrow-" (name c))
                       :key (str "arrow-" (name c))
                       :orient "auto"
                       :marker-width (* 1.5 stroke-width)
                       :marker-height (* 3 stroke-width)
                       :ref-x "5"
                       :ref-y "3"}
              [:path {:d "M0,0 V6 L3,3 Z" :fill (generate-color-from-term (name c))}]])
           controllers)]
     
     [:line {:x1 (/ width-factor 2)
             :x2 (/ width-factor 2)
             :y1 0
             :y2 height
             :stroke "black"
             :stroke-width stroke-width
             :stroke-dasharray "2"}] 

     [render-controller-verticals events controllers {:width-factor width-factor :get-top get-top :stroke-width stroke-width}]
     [render-send-command-arrows openers closers controllers {:width-factor width-factor :get-top get-top :stroke-width stroke-width}]
     [render-app->controllers-arrows openers closers controllers {:width-factor width-factor :get-top get-top :stroke-width stroke-width}]

     

     


     ;; Command circles
     [:g (doall (map-indexed (fn [idx e]
                               (when (not= :pause (:type e))
                                 [:circle {:key (:id e)
                                           :stroke (if (= :controller (:type e)) (generate-color-from-term (:topic e)) "black")
                                           :stroke-width stroke-width
                                           :fill "white"
                                           :r (/ width-factor 4)
                                           :cy (get-top (:id e))
                                           :cx (+ (/ width-factor 2) (* width-factor (calculate-x e controllers)))}]))
                             events))]]))
