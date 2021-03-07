package com.zht.service;

import com.zht.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public List<Map<String, Object>> getUser() {
        return userDao.selectAll();
    }

    @Override
    public void addUser(Map<String, Object> map) {
        userDao.insertUser(map);
    }
}
