(ns keechma-devtools.controllers.consumer
  (:require [keechma.toolbox.pipeline.core :as pp :refer-macros [pipeline!]]
            [keechma.toolbox.pipeline.controller :as pp-controller]
            [keechma-devtools.fixtures :refer [fixtures]]
            [keechma-devtools.domain.processor :refer [process-event-batch]]
            ))





(defn print-fixtures []
  (doseq [f fixtures]
    (println f)))







;; (defn clear-stale-apps [app-db]
;;   (let [app-id (get-in app-db [:kv :events :active])
;;         app-events (get-in app-db [:kv :events :app])
;;         app-ids (keys app-events)
;;         stale-app-ids (filterv #(not= app-id %) app-ids)
;;         clean-app-events (apply dissoc app-events stale-app-ids)]
;;     (assoc-in app-db [:kv :events :app] app-events)))

;; (defn format-payload [payload]
;;   (when payload
;;     (str/trim (with-out-str (fipp-edn/pprint payload)))))

;; (defn format-event [payload]
;;   (let [event (zipmap event-fields payload)]
;;     (-> event
;;         (assoc :id (gensym "evid"))
;;         (assoc :formatted-payload (format-payload (:payload event))))))

;; (defn process-app-start-event [app-db event]
;;   app-db)
;; (defn process-app-stop-event [app-db event]
;;   app-db)

;; (defn controller-start-event [app-db event]
;;   app-db)
;; (defn controller-stop-event [app-db event]
;;   app-db)

;; (defn insert-event-report [app-db event-payload]
;;   (let [[app-id rest-payload] (split-event-payload event-payload)
;;         event (format-event rest-payload)
;;         app-events (or (get-in app-db [:kv :events :app app-id :events]) [])]
;;     (-> app-db
;;         (conj) (assoc-in [:kv :events :active] app-id)
;;         (assoc-in [:kv :events :app app-id :events] (conj app-events event)))))

;; (defn insert-event-reports [app-db events]
;;   (reduce (fn [acc e] (insert-event-report acc e)) app-db events))







(def controller
  (pp-controller/constructor
   (fn [_] true)
   {:start (pipeline! [value app-db]
             ;;(println (with-out-str (cljs.pprint/pprint (process-event-batch fixtures))))
             ;;(pp/commit! (insert-event-reports app-db fixtures))
             )
    :update (pipeline! [value app-db]
              )}))
