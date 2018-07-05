(ns keechma.devtools.reporter
  (:require [cognitect.transit :as t]
            [cljs.core.async :refer [chan put! <! timeout alts! close!]]
            [keechma.toolbox.ajax :refer [POST]]
            [keechma.app-state.core :refer [reg-on-start reg-on-stop]])
  (:require-macros [cljs.core.async.macros :refer [go-loop]]))

(defonce first-run? (atom true))

(deftype DefaultHandler []
  Object
  (tag [_ v] "unknown")
  (rep [_ v]
    (when v 
      (.toString v))))

(def transit-writer (t/writer :json {:handlers {:default (DefaultHandler.)}}))

(defn send-events [config events]
  (let [payload (t/write transit-writer events)]
    (POST (:url config) {:format :json
                         :params {:body payload}})))

(defn install
  ([app-config] (install app-config {:url "http://localhost:3000/e"}))
  ([app-config config]
   (let [collector-chan (chan)
         reporter (fn [app-name type direction topic name payload cmd-info severity]
                    (let [processed-payload (pr-str payload)
                          event [app-name type direction topic name processed-payload cmd-info severity]]
                      (when @first-run?
                        (swap! first-run? not)
                        (put! collector-chan [app-name :reporter nil nil :clear nil nil nil]))
                      (put! collector-chan event)))]
     (go-loop [events []]
       (let [[val channel] (alts! [collector-chan (timeout 50)])]
         (if (= collector-chan channel)
           (when val
             (recur (conj events val)))
           (do
             (when (seq events) (send-events config events))
             (recur [])))))
     (-> app-config
         (assoc :reporter reporter)
         (reg-on-stop #(close! collector-chan))))))
