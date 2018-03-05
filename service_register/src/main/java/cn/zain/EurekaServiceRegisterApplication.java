package cn.zain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 启动一个服务注册中心给其他应用使用
 * @author Zain
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceRegisterApplication.class, args);
    }
}
