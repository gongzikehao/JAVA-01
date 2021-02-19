package com.zht.hw4.beans.methods;

import com.zht.hw4.beans.entity.School;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Method3 {

    /**
     * desc：把POJO生声明为组件，通过注解配置上下文获取bean
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(School.class);
        School school = (School) context1.getBean("school");
        System.out.println(school.toString());

    }
}
