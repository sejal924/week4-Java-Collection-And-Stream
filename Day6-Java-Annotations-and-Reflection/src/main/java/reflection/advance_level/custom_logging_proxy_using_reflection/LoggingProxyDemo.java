package com.bridgelabz.reflection.advance_level.custom_logging_proxy_using_reflection;

import reflection.advance_level.custom_logging_proxy_using_reflection.Greeting;
import reflection.advance_level.custom_logging_proxy_using_reflection.GreetingImpl;
import reflection.advance_level.custom_logging_proxy_using_reflection.LoggingProxyHandler;

import java.lang.reflect.Proxy;

// Step 4: Create a Proxy Instance and Use It
public class LoggingProxyDemo {
    public static void main(String[] args) {
        // Creating the original object
        Greeting greeting = new GreetingImpl();

        // Creating a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                greeting.getClass().getClassLoader(),
                greeting.getClass().getInterfaces(),
                new LoggingProxyHandler(greeting)
        );

        // Using the proxy instance
        proxyInstance.sayHello("Alice");
    }
}