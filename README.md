# 🤖OpenAI API : Calling Methods

OpenAI API 是一种用于调用 OpenAI 模型的接口，可以帮助开发者更快更有效地训练模型，以便构建智能应用程序。 它允许开发者从 OpenAI 服务器调用模型，而无需了解服务器端的复杂技术。

## 🔎功能特性

* 支持多种深度学习框架：OpenAI API 支持多种深度学习框架，包括 TensorFlow、Keras、PyTorch 等。

* 在线调用：OpenAI API 可以在线调用模型，也可以通过客户端调用模型。

* 安全性：OpenAI API 可以保证开发者的数据安全，具有高度的安全性。

* 支持多种语言：OpenAI API 支持多种编程语言，包括 Java、Python、C++ 等。

## 💻安装使用
* 修改`application.yaml`文件<br>
  
* 配置`open.ai.apiKey`和`open.ai.organization`

## 📝示例

以下是使用OpenAI API进行调用的示例代码：

```
curl --location --request POST 'http://localhost:8080/openai/text' \
--header 'Content-Type: application/json' \
--data-raw '{
  "prompt": "介绍一下你自己"
}
'
```
```
curl --location --request POST 'http://localhost:8080/openai/img' \
--header 'Content-Type: application/json' \
--data-raw '{
  "prompt": "长河落日圆"
}
'
```



## 📖文档

官方文档：[https://platform.openai.com/docs/api-reference/introduction](https://platform.openai.com/docs/api-reference/introduction)


## 🌐社区

OpenAI官方论坛：https://discuss.openai.com/

## 🤝贡献
如果您有兴趣为本项目做出贡献，欢迎提交 Pull Request！
创作不易，如果这个项目对你有帮助可以分享给更多人，可以关注公众号或者微信扫码打赏。

![pay.png](src/main/resources/img/pay.png)
![WeChat.jpeg](src/main/resources/img/WeChat.jpeg)

