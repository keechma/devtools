(ns keechma-devtools.controllers
  (:require [keechma-devtools.controllers.consumer :as consumer]))

(def controllers
  (-> {:consumer consumer/controller}))
