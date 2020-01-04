package com.eurekaclient.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试 RestTemplate
 * @Author gaodehan
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/1/3
 */


@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "success";
    }

}
