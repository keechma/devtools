(ns keechma-devtools.ui.main
  (:require [keechma.ui-component :as ui]
            [keechma.toolbox.ui :refer [sub> <cmd]]))

(defn render [ctx]
  [:div
   (map 
    (fn [e]^{:key (:id e)} [:div (pr-str e)])
    (sub> ctx :events))])

(def component
  (ui/constructor {:renderer render
                   :subscription-deps [:events]}))
