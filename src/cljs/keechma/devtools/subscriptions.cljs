(ns keechma.devtools.subscriptions
  (:require [keechma.toolbox.dataloader.subscriptions :as dataloader]
            [keechma.devtools.edb :refer [edb-schema]]
            [keechma.devtools.datasources  :refer [datasources]])
  (:require-macros [reagent.ratom :refer [reaction]]))

(defn get-kv [key]
  (fn [app-db-atom]
    (reaction
     (get-in @app-db-atom (flatten [:kv key])))))

(defn row-dimensions [app-db-atom]
  (reaction
   (get-in @app-db-atom [:kv :row-dimensions])))

(defn event-expanded? [app-db-atom id]
  (reaction
   (contains? (set (get-in @app-db-atom [:kv :expanded-event-ids])) id)))

(defn events [app-db-atom]
  (reaction
   (let [events (get-in @app-db-atom [:kv :events])
         app-name (get-in events [:state :name])
         app-versions (get-in events [:state :versions])]
     (mapv
      (fn [v]
        (let [app (get-in events [:versions v])]
          (assoc app :name [app-name v])))
          app-versions))))

(def subscriptions
  {:events events
   :event-expanded? event-expanded?
   :row-dimensions row-dimensions})
