package com.xu.provider.service;

import com.xu.api.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 定义一个服务实现
 */
@Service(
    version = "${hello.service.version}",//版本
    application = "${dubbo.application.id}",//应用ID
    protocol = "${dubbo.protocol.id}",//协议ID
    registry = "${dubbo.registry.id}"//注册中心ID
)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("dubbo 提供者，参数name:"+ name);
        return "hello " + name + " this is a dubbo provider!!";
    }
}
