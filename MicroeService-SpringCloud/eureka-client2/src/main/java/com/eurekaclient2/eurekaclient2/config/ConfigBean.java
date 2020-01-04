package com.eurekaclient2.eurekaclient2.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 相当于spring.xml
 * @Author gaodehan
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/1/3
 */

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端  负载均衡的工具
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

}
