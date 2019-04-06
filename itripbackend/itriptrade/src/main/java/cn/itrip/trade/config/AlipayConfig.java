package cn.itrip.trade.config;

public class AlipayConfig {
    public static String app_id = "2016092800614873";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC2oSSZYxgk5lUb9FvJsRiZEdUjWLRBocz8RQsp4KzJ5r3AvaZc2Npv+gzqs4dAAp1/xeLoGJ+lZFaFRFpyAeIFeIWWNQ/tx5xh3h/coPaDTIo24ltheIygfCzEIhv011554G0bXlrI7phLAR01ZDVv3JA5nuM/ifBD8q6kEDECeHOMFS8/lAnn+/P0UUItVnurEl5hVKHgePn2eOt7UzoLG0M0kJRzyw/raapdkKKy5Ivk+a9OBvJPu7wggQmROqFUvHcqNSpdPVZzMN6L+E4gpErE9rJENo5XAkS+LbUbKzJc/mxlJbrNOS9gjyfLPUb6Xj5e06VallK2YEqfz65NAgMBAAECggEAJIZX3oFuC7sxHFUjolPT2pExck9ERbgJWg6o6+guRnbqTkjfo8QO88QrnyjmjMu5GhvGhKqgCyDlGOQRvqlXvcZb2S2lkOWSBhS5hJOAmcPOBKoCopzMazBKd7NmqfIEyBU1XPri5zqopJ+Fau8urL+M7Kk1Q7jfn4dCnDdMxfRgi2cHOMiUV6ufoQJ18x1BYLqNfsfTywzRbQUE38HplN1ArRU8i/15NXiROvFOXKJegt0M72E0+m8xya2Eea+MMaY4SxcoxXZjupPg1dkUJnO7/NC7hYAYVs1k46FInHU3sfhXh9wzWAH1E89mL00Lt2brYijf2PeIHRGy3kr2AQKBgQDdwi0R4fzhlD+roYnYjJ3o/SFHmnBCEzIwnltM57PRM3IS4+4x9aFfOd8aDcuTb6nJh7S+BKuNINdkEKBUPLPxeVIXfC7Kgn07nFFBA7W5LxbZVmx1CORptrylzvsEJrbGw/rSAcGqKws+Q7NB7ToWDPMbgaEhlXlBmcOcZYEBgQKBgQDS1D9KlbVe0LLwykVuUt0+XLEeaEFkS+g5mF2lW8RCSqB3lDwV8bsKRCtBbul/4fe5YBIlGGh+cci91+n2mcPXspYlIz6Rw9Y1+CS1vLk3aoh+Ntdr2VatclHGhjtqyHka2cKroXKmq7l5O42ilj/CE78bQ8WgTwS1nUAfLcp6zQKBgD4TAZy03p2iauQ3NqfYTMeQO8WYVH4ac30qhrITVcFknjTtepqfgElwoKPhYq/lnOhdxVk/Y2oA3GoVQVvzFgetBy6tw0dKmZWbHx+M00yAAuxZhciI8a8pyMq9EoTJ9XXUHBy3AygIHoCSYNY+enj7rP1xHtKQzb1wNlJME32BAoGAdG2CBk5mutXF+/O4JBTe2XGW3pP0iM7ij+v0yzzCRVmxBFh4ViYIhMLgoGH/0P+ZLmY/nvy7uBheI3j5W5XO8W9OO3QbOaRMx8EhhLuUDWZnukvO62A63c4kGt5GMdJEDu/y8ZVXG3P6GVkp/n+69hKxlvz2RnFcyG7u2kkPaIECgYAjOgpsB1N7jES2LcIQ3hIJGIfhfrAd/ZDrNvm7/cLIX715k0Bcxoc9EBgWbW5I0+hSqz36aikMOdb4wkscxPMzZlXyTg1PAED23bCgsvntQ9ElpPqLHRsGw9Pa89Lr9u89pZOLvrm4Z3kAHqOTTYrcjJ5yen+mgNpm888sF9CYDg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu3sn2I3nUkRxTr1pUjDcFtnf1q5ybMLLu5qKqH4fE1Nx4jQ78QmY2wVULHyXNTCFY5mCHC78jDUfBZS1rSKUXlBcQEe68mOUxrBle96/s7+cdUui6fTzWVeyG/vS1nlmvgsIngxR6Db+JCVTefchUJJ4n6UDAbAU1k/EyabbBIZxXsoAxTqqXg9lrmxK2dfpTfAxTk5UYPznBjCmEE0/zrZv4VdB+RLcLQ/isrjwIAsx0/UmKybAi/NzEFR+xMUrOWMnWbp3voQTAlwUF5Faa0Fo/hXen/U1naAyX63rbg4KQ3Isk/86TGmqDf8wYuRu334rTxjmYzeaRgfSA65JXwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 post
    public static String notify_url = "http://23adas.natappfree.cc/trade/api/notifyUrl";

    // 面页面跳转同步通知页路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://23adas.natappfree.cc/trade/api/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关 沙箱环境 alipayde
    public static String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";

    public static String paymentSuccessUrl="localhost";
}
