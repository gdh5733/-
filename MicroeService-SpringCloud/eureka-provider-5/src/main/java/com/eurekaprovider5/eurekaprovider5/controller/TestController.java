package com.eurekaprovider5.eurekaprovider5.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    private static  String MESSAGE = "错误方法已被hystix处理";

    @GetMapping("/test1")
    //一旦调用服务方法失败并抛出了错误信息后,会自动调用@HystrixCommand标注好的fallbackMethod指定的方法
    @HystrixCommand(fallbackMethod = "handkeMeth")
    public String test1() {
           int a =1/0;

        return "success1";
    }

    /**
     * 相当于兜底的方法
     */
    public String handkeMeth(){
        // TODO: 2020/1/5 此处写要做处理的代码

        return MESSAGE;
    }

}
