(ns verbose_octo_telegram.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn test1-handler [request]
  {:status 200
   :body "test1 handler"})

(defn test2-handler [request]
  {:status 200
   :body "test2 handler"})

(defn handler [request]
  (condp = (:uri request)
    "/test1" (test1-handler request)
    "/test2" (test2-handler request)
    nil))

(defn -main [& args]
  (println "Clojure web app started. Listening on port 3000.")
  (jetty/run-jetty handler {:port 3000}))
