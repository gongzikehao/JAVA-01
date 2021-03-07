package com.zht.service;

import com.zht.annotation.MyDataSource;
import com.zht.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    @MyDataSource(name = "first")
    public List<Map<String, Object>> getFirst() {
        return userDao.selectAll();
    }

    @Override
    @MyDataSource(name = "second")
    public List<Map<String, Object>> getSecond() {
        return userDao.selectAll();
    }

    @Override
    @MyDataSource(name = "third")
    public List<Map<String, Object>> getThird() {
        return userDao.selectAll();
    }
}
