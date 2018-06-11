package com.scdemo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心服务启动类
 * @author rex
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	
	/**
	 *	本地调试直接运行main方法即启动（springboot内置tomcat）
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServerApplication.class, args);
		
	}

}