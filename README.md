# clj-slack

A Clojure library designed to let you send message to slack.

[Slack](https://slack.com) is very powerful tool for company communication.

Our company uses it all day. When our user creates a feedback to us , we receive a message in slack channel, so we can respond to our user very quickly. 

![Image](http://lzw-picture.qiniudn.com/slack1.png)


## Usage
```clojure
(require 'clj-slack.core :as slack)
(slack/send-msg slack-url "msg")
```

Then in your slack channel, you will recevie message.
Also you can specify the icon by `:icon_url` or `:icon_emoji`, the username by `:username`,

```clojure
(slack/send-msg slack-url "msg" :username "lzwjava" :icon_url icon-url)
```


```clojure
(slack/send-msg slack-url "msg" :icon_emoji icon-url)
```

If you use `:icon_emoji` and `:icon_url` together, the latter option will be showed in slack.

```clojure
(slack/create-link "http://www.baidu.com" "Click here!")
```

## Test
Run `lein test`, but you should specify slack url in the test file.

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

