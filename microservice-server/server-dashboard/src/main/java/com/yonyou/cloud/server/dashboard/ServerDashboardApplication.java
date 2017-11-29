package com.yonyou.cloud.server.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
//@EnableDiscoveryClient
@EnableHystrixDashboard
public class ServerDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDashboardApplication.class, args);
	}
}
