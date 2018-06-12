#Spring Cloud Demo

##服务列表

***
#### scdemo-eureka-server
* 注册中心，所有服务往这里注册
* 高可用集群（端口占用8971、8972）
* 需要启动两个以上的eureka服务，以达到高可用
* http://localhost:port 

***
#### scdemo-common-util
* 基础服务

***
#### scdemo-config-server
* 分布式配置中心，server服务端
* 消息总线在client客户端	
	
***
#### scdemo-config-client
* 分布式配置中心 client客户端
* 消息总线，采用kafka，使用前需启动zookeeper和kafka
* 需要先启动config-server
* 刷新：post请求，http://localhost:port/refresh

***
#### scdemo-parking-server
* parking服务
* rest+ribbon 方式调用服务
* hystrix 断路器
* HystrixDashboard 仪表盘实时监控

***
#### scdemo-user-server
* user服务
* feign方式调用服务
* hystrix 断路器
* HystrixDashboard 仪表盘实时监控
* http://localhost:port/hystrix 

***
#### scdemo-zuul-server
* 服务网关
* 转发parking和user，详情看配置文件

***
#### scdemo-zipkin-server
* 服务链路跟踪
* 收集调用数据
* http://localhost:port/zipkin