package com.yonyou.cloud.server.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * 
 * @author daniell
 *使用Stream方式启动ZipkinServer
 */
@EnableZipkinStreamServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkinApplication.class, args);
	}
}
