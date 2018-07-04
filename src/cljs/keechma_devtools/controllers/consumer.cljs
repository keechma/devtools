(ns keechma-devtools.controllers.consumer
  (:require [keechma.toolbox.pipeline.core :as pp :refer-macros [pipeline!]]
            [keechma.toolbox.pipeline.controller :as pp-controller]
            [keechma-devtools.fixtures :refer [fixtures]]
            [keechma-devtools.domain.processor :refer [process-event-batch]]
            [keechma-devtools.domain.accumulator :refer [store-events]]))


(def controller
  (pp-controller/constructor
   (fn [_] true)
   {:start (pipeline! [value app-db]
             (pp/commit! (store-events app-db (process-event-batch fixtures))))
    :update (pipeline! [value app-db]
              )}))
