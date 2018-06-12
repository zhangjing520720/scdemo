package com.scdemo.config.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * config 客户端启动类
 * 1、分布式配置中心 client客户端
 * 2、消息总线，采用kafka方式，使用前需启动zookeeper和kafka
 * @author rex
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {
	
	/**
	 *	本地调试直接运行main方法即启动（springboot内置tomcat）
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(ConfigClientApplication.class, args);
		
	}

}
