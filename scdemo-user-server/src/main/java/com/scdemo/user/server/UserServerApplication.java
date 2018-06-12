package com.scdemo.user.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * user服务启动类
 * 1、feign方式调用服务
 * 2、hystrix 断路器
 * 3、HystrixDashboard 仪表盘实时监控
 * @author rex
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class UserServerApplication {
	
	/**
	 *	本地调试直接运行main方法即启动（springboot内置tomcat）
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(UserServerApplication.class, args);
		
	}
}
