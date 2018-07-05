(ns keechma.devtools.domain.processor
  (:require [cognitect.transit :as t]
            [cljs.reader :refer [read-string]]))

(def transit-reader
  (t/reader :json
            {:handlers
             {:default (fn [tag value] (t/tagged-value tag value))}}))

(def read-string-options {:default (fn [_ value] (pr-str value))})

(def event-fields [:type :direction :topic :name :payload :cmd-info :severity])

(defn split-event-line-item [line-item]
  [(first line-item) (rest line-item)])

(defn process-event-payload [event]
  (let [payload (:payload event)
        processed-payload (read-string read-string-options payload)]
    (assoc event :payload processed-payload)))

(defn process-event [line-item]
  (let [[[app-name app-version] event-data] (split-event-line-item line-item)
        event (zipmap event-fields event-data)]
    {:app {:name app-name
           :version app-version}
     :event (-> event
                (assoc :id (or (get-in event [:cmd-info :id]) (gensym "evid")))
                (process-event-payload))}))

(defn process-event-batch [batch]
  (let [processed (t/read transit-reader batch)]
    (mapv process-event processed)))
