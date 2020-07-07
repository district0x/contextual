(defproject com.cognitect/contextual "0.1.0-SNAPSHOT"
  :description "Associative values in Clojure and ClojureScript which
  know their context"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]]
  :profiles {:dev {:dependencies [[org.clojure/test.check "1.0.0"]]
                   :plugins [[lein-cljsbuild "1.1.8"]
                             [com.cemerick/clojurescript.test "0.3.3"]]
                   :aliases {"test-all" ["do" "test," "cljsbuild" "test"]}
                   :cljsbuild {:test-commands {"all" ["phantomjs" "target/test-runner.js"]}
                               :builds [{:source-paths ["src" "test"]
                                         :compiler {:output-to "target/test-runner.js"
                                                    :optimizations :whitespace
                                                    :pretty-print true}}]}}}
  )
