package com.xu.consumer.consumer;

import com.xu.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference(version = "${hello.service.version}")
    IHelloService helloService;

    @GetMapping("/hello")
    public String hello(String name){
        System.out.println("dubbo 消费者，参数name:"+ name);
        System.out.println("hello " + name + " this is a dubbo consumer!!");
        return helloService.sayHello(name);
    }

}
