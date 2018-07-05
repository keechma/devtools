(ns keechma.devtools.controllers
  (:require [keechma.devtools.controllers.consumer :as consumer]
            [keechma.devtools.controllers.event :as event]))

(def controllers
  (-> {:consumer consumer/controller
       :event    event/controller}))
