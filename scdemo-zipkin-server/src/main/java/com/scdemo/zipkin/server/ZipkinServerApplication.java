package com.scdemo.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import zipkin.server.EnableZipkinServer;

/**
 * zipkin服务启动类
 * 1、收集调用数据
 * 2、服务跟踪
 * 3、关联parking和user服务
 * @author rex
 * @version 1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {
	
	/**
	 *	本地调试直接运行main方法即启动（springboot内置tomcat）
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(ZipkinServerApplication.class, args);
		
	}
}
