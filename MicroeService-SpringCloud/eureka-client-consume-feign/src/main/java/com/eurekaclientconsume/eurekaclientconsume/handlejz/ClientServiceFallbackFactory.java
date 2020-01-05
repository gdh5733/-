package com.eurekaclientconsume.eurekaclientconsume.handlejz;


import com.eurekaclientconsume.eurekaclientconsume.service.Clientservice;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author gaodehan
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/1/5
 */

@Component
public class ClientServiceFallbackFactory implements FallbackFactory<Clientservice> {

    private static  String ERROR_MESSAGE = "服务正在处理中..(实际服务已经关闭做了降级处理,等待服务重启)";
    @Override
    public Clientservice create(Throwable throwable) {

        return new Clientservice() {
            @Override
            public String test1() {
                return ERROR_MESSAGE;
            }
        };
    }
}
