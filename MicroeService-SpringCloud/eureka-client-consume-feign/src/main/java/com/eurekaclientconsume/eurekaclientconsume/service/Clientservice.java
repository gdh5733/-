package com.eurekaclientconsume.eurekaclientconsume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "eureka-client3")
public interface Clientservice {

    @GetMapping("/test1")
    public String test1();
}
