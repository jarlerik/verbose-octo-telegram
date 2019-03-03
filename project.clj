(defproject verbose_octo_telegram "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
                      :url "https://www.eclipse.org/legal/epl-2.0/"}
            :dependencies [[org.clojure/clojure "1.10.0"] [ring/ring-core "1.6.3"] [ring/ring-jetty-adapter "1.6.3"]]
            :repl-options {:init-ns verbose_octo_telegram.core}
            :main verbose_octo_telegram.core
            :aot [verbose_octo_telegram.core]
            :ring {:handler verbose_octo_telegram.core/handler}
            :plugins [[lein-ring "0.12.5"]])
