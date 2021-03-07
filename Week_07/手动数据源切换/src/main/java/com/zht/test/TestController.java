package com.zht.test;

import com.zht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("test")
    public String test(){
        List<Map<String, Object>> first = userService.getFirst();
        System.out.println(first);

        List<Map<String, Object>> second = userService.getSecond();
        System.out.println(second);

        List<Map<String, Object>> third = userService.getThird();
        System.out.println(third);

        return "ok";
    }
}
