package com.eurekaprovider5.eurekaprovider5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.eurekaprovider5.eurekaprovider5"})
@EnableEurekaClient
@EnableCircuitBreaker //对hystrixR 熔断机制的支持
public class EurekaProvider5Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider5Application.class, args);
    }

}
