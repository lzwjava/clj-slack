# clj-slack

A Clojure library designed to let you send message to slack.

## Usage
```
(require 'clj-slack.core :as slack)

(slack/send-msg slack-url "text")

```
Then in your slack channel, you will recevie message.
Also you can specify the icon by :icon_url or :icon_emoji, the username by :username,

```clojure
(slack/send-msg slack-url "msg" :username "lzwjava"       :icon_url  "https://cn.avoscloud.com/images/static/press/Logo%20Avatar.png" 
```


```clojure
(let [text (str "There's sth new!\n" (create-link "http://www.baidu.com" "Click here!"))
          res (send-msg slackUrl text :username "lzwjava" :icon_emoji ":ghost:")]
      (is res true))

```

FIXME

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

