(ns keechma-devtools.controllers.consumer
  (:require [keechma.toolbox.pipeline.core :as pp :refer-macros [pipeline!]]
            [keechma.toolbox.pipeline.controller :as pp-controller]
            [keechma-devtools.fixtures :refer [fixtures]]
            [keechma-devtools.domain.processor :refer [process-event-batch]]
            [keechma-devtools.domain.accumulator :refer [store-events]]
            [keechma.controller :as controller]
            [cljs.core.async :refer [<!]]
            [cljsjs.socket-io]
            [oops.core :refer [ocall oget]])
  (:require-macros [cljs.core.async.macros :refer [go-loop]]))

(def io (oget js/window "io"))

#_(def controller
  (pp-controller/constructor
   (fn [_] true)
   {:start (pipeline! [value app-db]
             (pp/commit! (store-events app-db (process-event-batch fixtures))))
    :update (pipeline! [value app-db]
              )}))

(defn connect-io [controller]
  (let [conn (ocall io "connect" "/")]
    (ocall conn "on" "event" #(controller/execute controller :events %))
    #(ocall conn "disconnect")))


(defrecord Controller [])

(defmethod controller/params Controller [_ _] true)

(defmethod controller/handler Controller [this app-db-atom in-chan _]
  (let [disconnect-io (connect-io this)]
    (go-loop []
      (let [[cmd args] (<! in-chan)]
        (when cmd
          (case cmd
            :stop (disconnect-io)
            :events (reset! app-db-atom (store-events @app-db-atom (process-event-batch args)))
            nil)
          (recur))))))

(defmethod controller/stop Controller [this _ app-db]
  (controller/execute this :stop nil))

(def controller
  (->Controller))
