package com.zht.controller;

import com.zht.beans.Klass;
import com.zht.beans.School;
import com.zht.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Student student;
    @Autowired
    School school;
    @Autowired
    Klass klass;

    @RequestMapping("hi")
    public String hi(){
        System.out.println(student.toString());
        System.out.println(school.toString());
        System.out.println(klass.toString());
        return "ok";
    }

}
