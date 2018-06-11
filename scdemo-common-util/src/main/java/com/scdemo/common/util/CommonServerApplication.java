package com.scdemo.common.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 基础服务启动类
 * @author rex
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class CommonServerApplication {
	
	/**
	 *	本地调试直接运行main方法即启动（springboot内置tomcat）
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(CommonServerApplication.class, args);
		
	}

}
