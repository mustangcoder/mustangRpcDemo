package org.example;

import org.mustangcoder.rpc.provider.annotation.RpcProvider;

@RpcProvider
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String data) {
        return "receive your msg:" + data + ", give you reply: hello customer!";
    }
}
