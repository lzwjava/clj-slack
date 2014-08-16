(ns clj-slack.core-test
  (:require [clojure.test :refer :all]
            [clj-slack.core :refer :all]))

(def slackUrl "")

(deftest send-msg-test
  (testing "send-msg"
    (let [text (str "There's sth new!\n" (create-link "http://www.baidu.com" "Click here!"))
          res (send-msg slackUrl text :username "lzwjava" :icon_emoji ":ghost:")]
      (is res true))))
