(ns keechma.devtools.domain.accumulator-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [keechma.devtools.domain.accumulator :as a]))

(def e-app-start
  {:app {:name :application :version :v1}
   :event
   {:type :app
    :direction :in
    :topic nil
    :name :start
    :payload
    [:redirect
     :initializer
     :logout
     :user-actions
     :keechma.toolbox.dataloader.core/dataloader
     :keechma.toolbox.forms.core/forms
     :keechma.toolbox.forms.mount-controller/id]
    :cmd-info
    {:id :cmd2 :created-at 1530696686605 :duration 0 :status :done}
    :severity :info
    :id "evid2319"}})

(def e-app-stop
  {:app {:name :application, :version :v1},
   :event
   {:type :app,
    :direction :in,
    :topic nil,
    :name :stop,
    :payload nil,
    :cmd-info
    {:id :cmd70, :created-at 1530696691673, :duration 0, :status :done},
    :severity :info,
    :id "evid2376"}})

(def e-running-controllers
  {:app {:name :application :version :v1}
   :event
   {:type :app
    :direction :in
    :topic nil
    :name :running-controllers
    :payload
    {:redirect {:page "editor"}
     :initializer true
     :user-actions true
     :keechma.toolbox.dataloader.core/dataloader {:page "editor"}
     :keechma.toolbox.forms.core/forms true
     :keechma.toolbox.forms.mount-controller/id {:page "editor"}}
    :cmd-info
    {:id :cmd39 :created-at 1530696686624 :duration 0 :status :done}
    :severity :info
    :id "evid2355"}})

(def e-route-changed
  {:app {:name :application :version :v1}
   :event
   {:type :router
    :direction :out
    :topic nil
    :name :route-changed
    :payload {:route ":page" :data {:page "editor"}}
    :cmd-info
    {:id :cmd3 :created-at 1530696686608 :duration 0 :status :done}
    :severity :info
    :id "evid2320"}})

(defn app-db->store [app-db]
  (get-in app-db [:kv :events]))

(deftest app-start-event-will-register-the-app
  (is (= (app-db->store (a/store-events {} [e-app-start]))
         {:state {:versions [:v1]
                  :name :application}
          :versions {:v1 {:controllers #{:redirect
                                         :initializer
                                         :logout
                                         :user-actions
                                         :keechma.toolbox.dataloader.core/dataloader
                                         :keechma.toolbox.forms.core/forms
                                         :keechma.toolbox.forms.mount-controller/id}
                          :state :started
                          :events (map a/process-event-payload [(:event e-app-start)])
                          :running-controllers {}
                          :watched #{}
                          :ignored #{}}}})))

(deftest app-stop-event-will-change-the-app-status
  (is (= (app-db->store (a/store-events {} [e-app-start e-app-stop]))
         {:state {:versions [:v1]
                  :name :application}
          :versions {:v1 {:controllers #{:redirect
                                         :initializer
                                         :logout
                                         :user-actions
                                         :keechma.toolbox.dataloader.core/dataloader
                                         :keechma.toolbox.forms.core/forms
                                         :keechma.toolbox.forms.mount-controller/id}
                          :state :stopped
                          :events (map a/process-event-payload [(:event e-app-start) (:event e-app-stop)])
                          :running-controllers {}
                          :watched #{}
                          :ignored #{}}}})))

(deftest app-stop-event-will-change-the-app-status-only-if-app-is-registered
  (let [events [e-app-start (assoc-in e-app-stop [:app :version] :v2)]]
    (is (= (app-db->store (a/store-events {} events))
           {:state {:versions [:v1]
                    :name :application}
            :versions {:v1 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start)])
                            :running-controllers {}
                            :watched #{}
                            :ignored #{}}}}))))

(deftest multiple-apps-versions-can-be-stored
  (let [e-app-start-2 (assoc-in e-app-start [:app :version] :v2)]
    (is (= (app-db->store (a/store-events {} [e-app-start e-app-start-2]))
           {:state {:versions [:v1 :v2]
                    :name :application}
            :versions {:v1 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start)])
                            :running-controllers {}
                            :watched #{}
                            :ignored #{}}
                       :v2 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start-2)])
                            :running-controllers {}
                            :watched #{}
                            :ignored #{}}}}))))

(deftest at-most-two-version-of-app-will-be-stored
  (let [e-app-start-2 (assoc-in e-app-start [:app :version] :v2)
        e-app-start-3 (assoc-in e-app-start [:app :version] :v3)]
    (is (= (app-db->store (a/store-events {} [e-app-start e-app-start-2 e-app-start-3]))
           {:state {:versions [:v2 :v3]
                    :name :application}
            :versions {:v2 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start-2)])
                            :running-controllers {}
                            :watched #{}
                            :ignored #{}}
                       :v3 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start-3)])
                            :running-controllers {}
                            :watched #{}
                            :ignored #{}}}}))))

(deftest event-will-be-added-only-if-the-app-version-is-registered
  (let [events [e-app-start e-route-changed (assoc-in e-route-changed [:app :version] :v23)]]
    (is (= (app-db->store (a/store-events {} events))
           {:state {:versions [:v1]
                    :name :application}
            :versions {:v1 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start) (:event e-route-changed)])
                            :running-controllers {}
                            :watched #{}
                            :ignored #{}}}}))))

(deftest running-controllers-event
  (is (= (app-db->store (a/store-events {} [e-app-start e-running-controllers]))
         {:state {:versions [:v1]
                  :name :application}
          :versions {:v1 {:controllers #{:redirect
                                         :initializer
                                         :logout
                                         :user-actions
                                         :keechma.toolbox.dataloader.core/dataloader
                                         :keechma.toolbox.forms.core/forms
                                         :keechma.toolbox.forms.mount-controller/id}
                          :state :started
                          :events (map a/process-event-payload [(:event e-app-start) (:event e-running-controllers)])
                          :running-controllers {:redirect {:page "editor"}
                                                :initializer true
                                                :user-actions true
                                                :keechma.toolbox.dataloader.core/dataloader {:page "editor"}
                                                :keechma.toolbox.forms.core/forms true
                                                :keechma.toolbox.forms.mount-controller/id {:page "editor"}}
                          :watched #{}
                          :ignored #{}}}})))


(deftest running-controllers-event-will-not-be-stored-if-app-is-not-registered
  (let [events [e-app-start e-running-controllers (assoc-in e-running-controllers [:app :version] :v23)]]
    (is (= (app-db->store (a/store-events {} events))
           {:state {:versions [:v1]
                    :name :application}
            :versions {:v1 {:controllers #{:redirect
                                           :initializer
                                           :logout
                                           :user-actions
                                           :keechma.toolbox.dataloader.core/dataloader
                                           :keechma.toolbox.forms.core/forms
                                           :keechma.toolbox.forms.mount-controller/id}
                            :state :started
                            :events (map a/process-event-payload [(:event e-app-start) (:event e-running-controllers)])
                            :running-controllers {:redirect {:page "editor"}
                                                  :initializer true
                                                  :user-actions true
                                                  :keechma.toolbox.dataloader.core/dataloader {:page "editor"}
                                                  :keechma.toolbox.forms.core/forms true
                                                  :keechma.toolbox.forms.mount-controller/id {:page "editor"}}
                            :watched #{}
                            :ignored #{}}}}))))
