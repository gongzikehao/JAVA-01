package com.zht.hw4.beans.methods;

import com.zht.hw4.beans.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Method1 {

    /**
     * desc：通过xml方式配置bean，从xml中获取bean
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("App.xml");
        Student myStudent = (Student) context.getBean("myStudent");
        System.out.println(myStudent.toString());
    }

}
