(ns cider.java.server.core
  (:require [clojure.tools.nrepl.server :as nrepl-server]
            [cider.nrepl :refer [cider-nrepl-handler]]))

(def inspected (atom {}))

(def running (atom false))

(defn fire-it-up [p]
  (if true
    (nrepl-server/start-server :port p :handler cider-nrepl-handler)
    (swap! running not)))

(gen-class
 :name cider.java.server.CiderServer
 :prefix ciderServer-
 :methods [^{:static true} [start [Integer] void]
           ^{:static true} [put [String Object] void]]
 )

(defn ciderServer-start [p]
  (fire-it-up p))

(defn ciderServer-put [id obj]
  (swap! inspected #(assoc % id obj)))

(defn get-obj [id]
  (get @inspected id))
