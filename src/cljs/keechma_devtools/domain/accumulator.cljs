(ns keechma-devtools.domain.accumulator
  (:require [clojure.string :as str]
            [fipp.edn :as fipp-edn]))

(defn event-matches? [ev-keys ev-match e]
  (let [ev-values (map (fn [k] (get e k)) ev-keys)]
    (= ev-match ev-values)))

(defn on-event-match [ev-keys ev-match handler]
  (fn [store e]
    (if (event-matches? ev-keys ev-match (:event e))
      (handler store e)
      store)))

(defn event-has-registered-app? [store e]
  (let [app-version (get-in e [:app :version])]
    (and (= (get-in e [:app :name]) (get-in store [:state :name]))
         (get-in store [:versions app-version]))))

(defn on-app-start-register-app-version [store e]
  (let [app-name (get-in e [:app :name])
        app-version (get-in e [:app :version])
        current-app-name (get-in store [:state :name])
        new-store (if (= current-app-name app-name)
                    (update-in store [:state :versions] conj app-version)
                    (assoc store :state {:versions [app-version] :name app-name}))]
    (assoc-in new-store [:versions app-version]
              {:controllers (set (get-in e [:event :payload]))
               :running-controllers {}
               :state :started
               :watched #{}
               :ignored #{}
               :events []})))

(defn on-app-start-remove-stale-app-versions [store e]
  (if (= 2 (count (get-in store [:state :versions])))
    store
    (let [active-versions (vec (take-last 2 (get-in store [:state :versions])))
          active-app-stores (select-keys (:versions store) active-versions)]
      (-> store
          (assoc-in [:state :versions] active-versions)
          (assoc :versions active-app-stores)))))

(def on-app-start
  (on-event-match
   [:type :direction :name] [:app :in :start]
   (fn [store e]
     (-> store
         (on-app-start-register-app-version e)
         (on-app-start-remove-stale-app-versions e)))))

(def on-app-stop
  (on-event-match
   [:type :direction :name] [:app :in :stop]
   (fn [store e]
     (let [app-version (get-in e [:app :version])]
       (if (event-has-registered-app? store e)
         (assoc-in store [:versions app-version :state] :stopped)
         store)))))

(def on-running-controllers
  (on-event-match
   [:type :direction :name] [:app :in :running-controllers]
   (fn [store e]
     (let [app-version (get-in e [:app :version])
           running-controllers (get-in e [:event :payload])]
       (if (event-has-registered-app? store e)
         (assoc-in store [:versions app-version :running-controllers] running-controllers)
         store)))))

(defn process-event-payload [event]
  (assoc event :processed-payload (str/trim (with-out-str (fipp-edn/pprint (:payload event))))))

(defn insert-pause-event [store e]
  (let [app-version (get-in e [:app :version])
        prev-events (get-in store [:versions app-version :events])
        prev-event (last prev-events)
        prev-created-at (get-in prev-event [:cmd-info :created-at])
        now (.getTime (js/Date.))]
    (if (and prev-created-at (> (- now prev-created-at) 2000))
      (let [batch-num (inc (count (filter #(= :pause (:type %)) prev-events)))
            pause-event {:id (gensym "pause")
                         :type :pause
                         :payload [batch-num now]
                         :severity :info}]
        (update-in store [:versions app-version :events] conj pause-event))
      store)))

(defn store-event-if-app-exists [store e]
  (let [app-version (get-in e [:app :version])
        event (:event e)]
    (if (event-has-registered-app? store e)
      (-> store
          (insert-pause-event e)
          (update-in [:versions app-version :events] conj (process-event-payload event)))
      store)))

(defn store-event [store e]
  (-> store
      (on-app-start e)
      (on-app-stop e)
      (on-running-controllers e)
      (store-event-if-app-exists e)))

(defn store-events [app-db events]
  (assoc-in
   app-db [:kv :events]
   (reduce (fn [acc e] (store-event acc e))
           (or (get-in app-db [:kv :events]) {})
           events)))
