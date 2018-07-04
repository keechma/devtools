(ns keechma-devtools.subscriptions
  (:require [keechma.toolbox.dataloader.subscriptions :as dataloader]
            [keechma-devtools.edb :refer [edb-schema]]
            [keechma-devtools.datasources  :refer [datasources]])
  (:require-macros [reagent.ratom :refer [reaction]]))

(defn get-kv [key]
  (fn [app-db-atom]
    (reaction
     (get-in @app-db-atom (flatten [:kv key])))))

(defn events [app-db-atom]
  (reaction
   (let [app-db @app-db-atom
         app-id (get-in app-db [:kv :events :active])
         events (get-in app-db [:kv :events :app app-id :events])]
     events)))

(def subscriptions
  {:events events})
