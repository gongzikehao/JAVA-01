package com.zht.hw4.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKDynamicProxy {
    public static void main(String[] args) {
        Stu stu = new Stu();
        ProxyFactory factory = new ProxyFactory(stu);
        IStu proxy = (IStu) factory.getInstance();
        proxy.study();
    }
}

class ProxyFactory{

    private Object target;

    public ProxyFactory(Object o){
        this.target = o;
    }

    public Object getInstance(){

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before func in proxy...");
                        Object result = method.invoke(target, args);
                        System.out.println("after func in proxy...");
                        return result;
                    }
                });
    }
}

interface IStu{
    void study();
}

class Stu implements IStu{

    @Override
    public void study() {
        System.out.println("in target...");
    }
}