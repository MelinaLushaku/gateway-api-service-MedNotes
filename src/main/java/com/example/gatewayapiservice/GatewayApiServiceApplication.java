package com.example.gatewayapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class GatewayApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApiServiceApplication.class, args);
    }

}
