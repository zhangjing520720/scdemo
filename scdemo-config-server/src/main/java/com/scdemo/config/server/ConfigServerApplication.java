package com.scdemo.config.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config服务启动类
 * 1、分布式配置中心 server端
 * 2、消息总线在client服务
 * @author rex
 * @version 1.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
	
	/**
	 *	本地调试直接运行main方法即启动（springboot内置tomcat）
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(ConfigServerApplication.class, args);
		
	}

}
