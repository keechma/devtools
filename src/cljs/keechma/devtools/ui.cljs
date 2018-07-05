(ns keechma.devtools.ui
  (:require [keechma.devtools.ui.main :as main]
            [keechma.devtools.ui.event :as event]))

(def ui
  {:main  main/component
   :event event/component})
