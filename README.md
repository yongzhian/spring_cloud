#####service_register
Eureka注册中心

#####service_producer
Eureka服务提供者
可以通过http://localhost:8888/add?a=10&b=20测试接口，此时返回30
多个服务可以直接修改ip进行启动
service_register\src\main\resources\中各个properties可以使用
doc\service_register\application.yml替换，在通过java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka2  启动即可

### consumer
##### 1 service_consumer
Eureka消费者，会基于ribbon轮询策略随机选择一台service_producer
服务之间通过restful方式调用

##### 2 service_feign_consumer
feign内部也使用了ribbon做负载均衡,更优雅
服务之间通过restful方式调用