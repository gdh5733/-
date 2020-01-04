package com.eurekaclient4.eurekaclient4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.eurekaclient4.eurekaclient4"})
public class EurekaClient4Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient4Application.class, args);
    }

}
