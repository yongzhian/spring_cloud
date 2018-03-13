package cn.zain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Zain
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class TurbineDashboardApplication {
        public static void main(String[] args) {
            SpringApplication.run(TurbineDashboardApplication.class, args);
        }
}
