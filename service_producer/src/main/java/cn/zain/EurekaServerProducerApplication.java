package cn.zain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 提供服务并发布到注册中心
 * @author Zain
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerProducerApplication.class, args);
    }
}
