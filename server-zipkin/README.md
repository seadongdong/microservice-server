### 使用Spring Cloud Sleuth和Zipkin进行分布式链路跟踪

### 1.pom文件添加

```
<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-sleuth-zipkin-stream</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-sleuth</artifactId>
        </dependency>
```


### 2.加入配置文件
```
#rabbitmq配置
  rabbitmq:
    host: 127.0.0.1
    port : 5672
    username: guest
    password: guest
```
