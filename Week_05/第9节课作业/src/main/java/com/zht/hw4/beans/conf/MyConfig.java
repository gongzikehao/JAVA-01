package com.zht.hw4.beans.conf;

import com.zht.hw4.beans.entity.Clazz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name = "clazz")
    public Clazz getClazz() {
        return new Clazz(1, "火箭班", "1075", 80);
    }
}
