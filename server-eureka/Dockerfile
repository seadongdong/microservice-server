FROM 172.16.199.203/yc_ops/centos-jdk-base

LABEL description = "this is eureka server"

ADD /app/target/server-eureka.jar /service/
RUN mkdir -p /service/logs/
RUN echo $(ls /service/)
WORKDIR /service
EXPOSE 8761
ENTRYPOINT  java -jar /service/server-eureka.jar