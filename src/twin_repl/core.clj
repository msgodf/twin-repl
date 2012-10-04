(ns twin-repl.core
  (:require [compojure.core :as compojure]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as jetty])
  (:use [hiccup core page]))

; a little bit of HTML as an index page, using hiccup for cleanliness
(defn index-page []
  (html5
    [:head
     [:title "twin-repl"]]
    [:body
     [:p "Hello REPL"]]))

(compojure/defroutes routes
                     (compojure/GET "/" [] (index-page))
                     (route/resources "/"))

(def app (handler/api routes))

(defn -main []
  (jetty/run-jetty app {:port 8080}))
