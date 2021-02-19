package com.zht.conf;

import com.zht.beans.Klass;
import com.zht.beans.School;
import com.zht.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfig {

    @Bean
    public Student getStudent() {
        return new Student("1", "zhang3");
    }

    @Bean
    public School getSchool() {
        return new School("47", "47zhong");
    }

    @Bean
    public Klass getKlass() {
        return new Klass("111");
    }

}
