package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

// 使用Turbine聚合监控数据

@EnableTurbine
@SpringBootApplication
public class TurbineApplication {
    public static void main( String[] args ){
    	SpringApplication.run(TurbineApplication.class, args);
    }
}
