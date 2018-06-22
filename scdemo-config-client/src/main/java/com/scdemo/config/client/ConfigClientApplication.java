package com.scdemo.config.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * config 客户端启动类
 * 1、分布式配置中心 client客户端
 * 2、消息总线，采用kafka方式，使用前需启动zookeeper和kafka
 * 3、需要先启动config-server
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

/**
启动kafka
1、首先启动zk
  1.1 cd /usr/local/Cellar/zookeeper/
  1.2 ls
  1.3 cd 3.4.12/
  1.4 cd bin
  1.5  zkserver start   ----启动zk
  
2、再启动kafka
    2.1 cd /usr/local/Cellar/kafka/  ---到kafka安装目录
    2.2 ls      ----查看kafka版本 比如我到是 1.1.0
    2.3 cd 1.1.0
    2.4 cd bin   
    2.5 ./kafka-server-start /usr/local/etc/kafka/server.properties  
3、启动生产进程（testTopic为主题名称） 需要先进入kafka/bin 下面
./kafka-console-producer --broker-list localhost:9092 --topic testTopic  
4、启动消费进程  需要先进入kafka/bin 下面
./kafka-console-consumer --bootstrap-server localhost:9092 --topic testTopic --from-beginning
 */

