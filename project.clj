(defproject twin-repl "0.1.0-SNAPSHOT"
  :description "A Clojure and ClojureScript project to demonstrate using REPLs to modify the live client and server parts of a webapp."
  :url "http://github.com/msgodf/twin-repl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [hiccup "1.0.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [org.clojure/tools.nrepl "0.2.0-beta9"]]
  :plugins [[lein-ring "0.7.0"]]
  :ring {:handler twin-repl.core/app}
  :main twin-repl.core)
