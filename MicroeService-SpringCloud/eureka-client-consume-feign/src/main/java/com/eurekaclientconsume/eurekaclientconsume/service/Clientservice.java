package com.eurekaclientconsume.eurekaclientconsume.service;

import com.eurekaclientconsume.eurekaclientconsume.handlejz.ClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "eureka-client3",fallbackFactory = ClientServiceFallbackFactory.class)
public interface Clientservice {

    @GetMapping("/test1")
    public String test1();
}
