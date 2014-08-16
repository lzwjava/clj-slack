(ns clj-slack.core-test
  (:require [clojure.test :refer :all]
            [clj-slack.core :refer :all]))

(def slack-url "")

(deftest send-msg-test
  (testing "send-msg"
    (let [text (str "A new feedback is created!\n" (create-link "http://www.baidu.com" "Click here for detail!"))
          res (send-msg slack-url text :username "Feedback" :icon_emoji ":ghost:")]
      (is res true))))
