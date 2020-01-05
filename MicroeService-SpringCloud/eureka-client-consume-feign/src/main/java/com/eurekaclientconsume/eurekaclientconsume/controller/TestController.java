package com.eurekaclientconsume.eurekaclientconsume.controller;
import com.eurekaclientconsume.eurekaclientconsume.service.Clientservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试restTemplate 调用client
 * @Author gaodehan
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/1/3
 */

@RestController
@Slf4j
public class TestController {


    @Autowired
    private Clientservice service;


    //使用restTemplate 进行调用
//    @Autowired
//    private RestTemplate restTemplate;
//
//    private static final String REST_URL_PREFIX = "http://eureka-client3/test1";
//
//    @GetMapping("/getClient1Test1")
//    public String getClient1Test1() {
//        String response = restTemplate.getForObject(REST_URL_PREFIX, String.class);
//        System.out.println("response={}" + response);
//        return response;
//    }


    //使用feign进行调用

    @GetMapping("/getClient1Test1")
    public String getClient1Test1() {
        String response = service.test1();
        System.out.println("response={}" + response);
        return response;
    }

}
