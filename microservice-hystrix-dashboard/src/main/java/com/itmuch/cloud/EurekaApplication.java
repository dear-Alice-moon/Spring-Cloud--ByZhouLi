package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

// 使用Hystrix Dashboard可视化监控数据

@SpringBootApplication
@EnableHystrixDashboard
public class EurekaApplication {
    public static void main( String[] args ){
        // System.out.println( "Hello World!" );
    	SpringApplication.run(EurekaApplication.class, args);
    }
}
