package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// Feign项目的Hystrix监控

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker  // 使用Hystrix组件，为项目启用断路器支持，可以使用/hystrix.stream端点监控Hystrix。
public class ConsumerMovieFeignApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignApplication.class, args);
	}
	
}
