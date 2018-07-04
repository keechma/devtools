(ns keechma-devtools.core 
  (:require [reagent.core :as reagent]
            [keechma.app-state :as app-state]
            [keechma.toolbox.dataloader.app :as dataloader]
            [keechma.toolbox.forms.app :as forms]
            [keechma-devtools.controllers :refer [controllers]]
            [keechma-devtools.ui :refer [ui]]
            [keechma-devtools.subscriptions :refer [subscriptions]]
            [keechma-devtools.edb :refer [edb-schema]]
            [keechma-devtools.datasources :refer [datasources]]
            [keechma-devtools.forms :as keechma-devtools-forms]
            [keechma.toolbox.css.app :as css]
            [keechma-devtools.stylesheets :refer [stylesheet]]))

(def app-definition
  (-> {:components    ui
       :controllers   controllers
       :subscriptions subscriptions
       :html-element  (.getElementById js/document "app")}
      (dataloader/install datasources edb-schema)
      (forms/install keechma-devtools-forms/forms keechma-devtools-forms/forms-automount-fns)
      (css/install (stylesheet))))

(defonce running-app (clojure.core/atom nil))

(defn start-app! []
  (reset! running-app (app-state/start! app-definition)))

(defn dev-setup []
  (when ^boolean js/goog.DEBUG
    (enable-console-print!)
    (println "dev mode")))

(defn reload []
  (let [current @running-app]
    (if current
      (app-state/stop! current start-app!)
      (start-app!))))

(defn ^:export main []
  (dev-setup)
  (start-app!))
