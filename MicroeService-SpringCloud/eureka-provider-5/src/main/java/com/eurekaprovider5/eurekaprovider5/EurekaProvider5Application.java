package com.eurekaprovider5.eurekaprovider5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class EurekaProvider5Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider5Application.class, args);
    }

}
