package com.eurekaserver3.eurekaserver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServer3Application {


    public static void main(String[] args) {
        SpringApplication.run(EurekaServer3Application.class, args);
        System.out.println("EurekaServer3启动完成！！！！");

        System.out.println("EurekaServer3启动完成！！！！");
    }

}
