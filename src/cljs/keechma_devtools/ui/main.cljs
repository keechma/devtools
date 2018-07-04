;; (ns keechma-devtools.ui.main
;;   (:require [keechma.ui-component :as ui]
;;             [keechma.toolbox.ui :refer [sub> <cmd]]))

;; (defn render-app-version [version app]
;;   [:div
;;    [:h2 {:style {:position "sticky" :top "20px" :background "red"}} version]
;;    [:ul
;;     (map (fn [e]
;;            ^{:key (:id e)} [:li (pr-str e)])
;;          (:events app))]])

;; (defn render [ctx]
;;   (let [events (sub> ctx :events)]    
;;     [:div
;;      [:h1 (get-in events [:state :name])]
;;      [:hr]
;;      (map (fn [version]
;;             ^{:key version} [render-app-version version (get-in events [:versions version])])
;;           (get-in events [:state :versions]))]))

;; (def component
;;   (ui/constructor {:renderer render
;;                    :subscription-deps [:events]}))


(ns keechma-devtools.ui.main
  (:require
   [keechma.ui-component :as ui]
   [keechma.toolbox.css.core :refer-macros [defelement]]
   [keechma.toolbox.ui :refer [sub> <cmd]]
   [reagent.core :as r]
   [oops.core :refer [oget oset!]]
   [keechma-devtools.util.json-renderer :as jr]
   [keechma-devtools.ui.graph :as graph]
   [keechma.toolbox.util :refer [class-names]]
   [fipp.edn :as fipp-edn]
   [clojure.string :as str]))

(defn scroll-to-bottom [this]
  (let [dom-node (r/dom-node this)]
    (oset! dom-node "scrollTop" (oget dom-node "scrollHeight"))))

(def base-graph-config
  {:height-factor 40
   :width-factor 16
   :stroke-width 2})

(defelement -main-wrap
  ;;:class [:absolute :left-0 :right-0 :bottom-0 :top-0]
  )

(defelement -app-events-wrap
  :class [:relative]
  )

(defelement -app-title-wrap
  :class [:bg-midnightblue :px2 :h1 :bd-black :c-white]
  :style {:height "100px"
          :line-height "50px"
          :position "sticky"
          :z-index 1000
          :top 0
          :border-bottom-style "solid"
          :border-bottom-width "1px"
          :border-top-style "solid"
          :border-top-width "2px"
          :border-top-color "black"
          :box-shadow "0px 0px 10px 0px rgba(0,0,0,0.3)"})

(defelement -events-graph-wrap
  :class [:relative :bd-silver]
  :style {:border-top-style "solid"
          :border-top-width "1px"})

(defelement -graph-wrap
  :class [:absolute :left-0 :top-0 :bottom-0]
  :style {:z-index 1
          :padding "0px 20px"})

(defelement -events-wrap
  :class [])

(defelement -running-controllers-wrap
  :class [:absolute :left-0 :right-0 :bd-midnightblue-l]
  :style {:height "30px"
          :top "50px"
          :border-top-style "solid"
          :border-top-width "1px"})

(defelement -controller-list
  :tag :ul
  :class [:m0]
  :style {:padding-left "20px"
          :padding-top "14px"
          :list-style "none"})

(defelement -controller-list-item
  :tag :li
  :class [:left :cursor-pointer :relative]
  :style [{:padding "2px"
           :z-index "1000"}
          [:.controller-payload {:display "none"}]
          [:&:hover [:.controller-payload {:display "block"}]]])

(defelement -controller-icon
  :class [:pill]
  :style [{:width "12px"
           :height "12px"}
          [:&.running {:background-color "#2ecc71"}]
          [:&.stopped {:background-color "#d35400"}]
          [:&.app {:border "1px solid #517293"}]])

(defelement -controller-payload
  :class [:rounded :bg-belizehole :absolute :controller-payload :p1 :h5]
  :style [{:min-width "200px"
           :max-width "500px"
           :margin-top "5px"
           :margin-left "-7px"
           :line-height "20px"
           :color "white"}
          [:&:before {:width 0
                      :height 0
                      :border-left "5px solid transparent"
                      :border-right "5px solid transparent"
                      :border-bottom "5px solid #2980b9"
                      :content "''"
                      :margin-top "-12px"
                      :position "absolute"
                      :z-index -1}]
          [:&:after {:width 0
                     :height 0
                     :border-left "5px solid transparent"
                     :border-right "5px solid transparent"
                     :border-top "5px solid #2980b9"
                     :content "''"
                     :margin-top "8px"
                     :position "absolute"
                     :z-index -1}]])

(defn calculate-graph-config [app-events]
  (assoc base-graph-config
         :width (* (:width-factor base-graph-config)
                   (inc (count (:controllers app-events))))
         
         :height (* (:height-factor base-graph-config)
                    (count (:events app-events)))))


(defn render-list-renderer [ctx app-events]
  (let [graph-config (calculate-graph-config app-events)
        events (:events app-events)]
    [-events-graph-wrap
     [-graph-wrap {:style {:width (str (:width graph-config) "px")}}
      [graph/render ctx app-events graph-config]]
     [-events-wrap
      (doall
       (map (fn [e] [(ui/component ctx :event) {:key (:id e) :graph-config graph-config} (:name app-events) e])
            events))]]))

(defn render-list [ctx app-events]
  (let [ev-count (atom 0)]
    (r/create-class
     {:reagent-render (fn [ctx app-events] [render-list-renderer ctx app-events])
      :component-did-mount scroll-to-bottom
      :component-did-update scroll-to-bottom})))

(defn render-running-controllers [collected-events]
  (let [controllers (:controllers collected-events)
        running-controllers (:running-controllers collected-events)]
    [-running-controllers-wrap
     [-controller-list
      [-controller-list-item {:key "keechma/app"}
       [-controller-icon {:class "app"}]]
      (doall (map (fn [c]
                    (let [running (get running-controllers c)
                          status (if running :running :stopped)]
                      [-controller-list-item {:key c}
                       [-controller-icon
                        {:class (class-names {:running (= :running status)
                                              :stopped (= :stopped status)})}]
                       [-controller-payload
                        [:div [:b {:class "nowrap"} (str c)] " (" (name status) ")"]
                        (when running
                          [:div.c-clouds
                           [:div.mt1.mxn1.bd-belizehole-l.border-top.p1 [:b "Params:"]]
                           [:pre.h6.m0.monospaced (str/trim (with-out-str (fipp-edn/pprint running)))]])]]))
                  controllers))]]))

(defn render [ctx measurements]
  (let [events (sub> ctx :events)]
    [-main-wrap
     (map 
      (fn [app]
        [-app-events-wrap {:key (str (:name app))}
         [-app-title-wrap (str (:name app))
          " "
          (if (= :started (:state app))
            [:span.c-emerald  "(running)"]
            [:span.c-pumpkin "(stopped)"])
          [render-running-controllers app]]
         [render-list ctx app]])
      events)]))

(def component
  (ui/constructor
   {:renderer render
    :component-deps [:event]
    :subscription-deps [:events :row-dimensions]}))
