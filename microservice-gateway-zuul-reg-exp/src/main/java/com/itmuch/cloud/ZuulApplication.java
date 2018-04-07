package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

// Zuul使用正则表达式指定路由规则

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main( String[] args ){
        // System.out.println( "Hello World!" );
    	SpringApplication.run(ZuulApplication.class, args);
    }
    
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
    	return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)", "${version}/${name}");
    }
    
}
