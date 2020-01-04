package com.eurekaclient2.eurekaclient2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description  测试restTemplate 调用client
 * @Author gaodehan
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/1/3
 */

@RestController
@Slf4j
public class TestController {

    @GetMapping("/getClient1Test1")
    public String getClient1Test1(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8778/test1";
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}",response);
        return response;
    }

}
