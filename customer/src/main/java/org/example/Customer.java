package org.example;

import org.mustangcoder.rpc.customer.RpcProxy;

/**
 * Hello world!
 *
 */
public class Customer
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HelloService helloServiceProxy = RpcProxy.getInstance().create(HelloService.class);
        String result = helloServiceProxy.sayHello("hello");
        System.out.println(result);
    }
}
