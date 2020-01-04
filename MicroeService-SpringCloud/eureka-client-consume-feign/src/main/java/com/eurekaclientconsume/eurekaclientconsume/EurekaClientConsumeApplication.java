package com.eurekaclientconsume.eurekaclientconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.eurekaclientconsume.eurekaclientconsume.*"})
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.eurekaclientconsume.eurekaclientconsume.*")
public class EurekaClientConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumeApplication.class, args);
    }

}
