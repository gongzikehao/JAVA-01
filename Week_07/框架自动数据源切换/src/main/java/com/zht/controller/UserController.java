package com.zht.controller;

import com.zht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("read")
    public List<Map<String,Object>> read() {
        return userService.getUser();
    }

    @RequestMapping({"write"})
    public String write(@RequestBody Map<String, Object> reqMap) {
        userService.addUser(reqMap);
        return "ok";
    }
}
