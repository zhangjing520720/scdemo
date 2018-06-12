package com.scdemo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心服务启动类
 * 1、注册中心，所有服务往这里注册
 * 2、高可用集群（端口占用8971、8972）
 * 3、需要启动两个以上的eureka服务，以达到高可用
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
