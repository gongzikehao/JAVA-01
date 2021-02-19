package com.zht.hw4.beans.methods;

import com.zht.hw4.beans.conf.MyConfig;
import com.zht.hw4.beans.entity.Clazz;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Method2 {

    /**
     * desc：从配置类中配置bean，通过注解配置上下文获取bean
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.zht.hw4.beans.conf");
        Clazz clazz = (Clazz) context.getBean("clazz");
        System.out.println(clazz.toString());

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfig.class);
        Clazz clazz1 = (Clazz) context1.getBean("clazz");
        System.out.println(clazz1.toString());

    }
}
