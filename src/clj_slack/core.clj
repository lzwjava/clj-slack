(ns clj-slack.core
  (:use [cheshire.core])
  (:require [org.httpkit.client :as http]))

(defn remove-nil [& params]
  (let [map (apply hash-map params)]
    (into {} (filter second map))))

(defn create-link
  [link text]
  (format "<%s|%s>" link text))

(defn send-msg [url text & {:keys [username icon_url icon_emoji]}]
  (let [map (remove-nil :text text :username username :icon_url icon_url :icon_emoji icon_emoji)]
    (let [options {:timeout 15000
                   :body (generate-string map)}]
      (= (:status @(http/post url options)) 200))))
