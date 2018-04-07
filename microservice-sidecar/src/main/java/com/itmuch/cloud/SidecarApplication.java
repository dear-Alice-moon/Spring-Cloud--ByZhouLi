package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarApplication {
    public static void main( String[] args ){
        // System.out.println( "Hello World!" );
    	SpringApplication.run(SidecarApplication.class, args);
    }
}
