package com.zht.service;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Map<String, Object>> getUser();

    void addUser(Map<String, Object> map);
}
