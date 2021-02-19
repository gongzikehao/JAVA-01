package com.zht.hw4.dynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestCglibProxy {
    public static void main(String[] args) {
        MyTarget target = new MyTarget();
        MyTarget myTarget = (MyTarget) new ProxyFactoryForCglib(target).getInstance();
        myTarget.print();
    }
}

class MyTarget{
    public void print() {
        System.out.println("in print...");
    }
}

class ProxyFactoryForCglib implements MethodInterceptor{

    private Object target;

    public ProxyFactoryForCglib(Object o) {
        this.target = o;
    }

    public Object getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before......");
        Object result = method.invoke(target, objects);
        System.out.println("after......");
        return result;
    }
}
