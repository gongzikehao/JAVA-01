package com.zht.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    @Select("select * from t_user")
    List<Map<String, Object>> selectAll();

    @Insert("<script>" +
            "insert into " +
            "t_user " +
            "(" +
            "username," +
            "password," +
            "nickname," +
            "idcard," +
            "phone," +
            "email" +
            ")values(" +
            "#{username}," +
            "#{password}," +
            "#{nickname}," +
            "#{idcard}," +
            "#{phone}," +
            "#{email}" +
            ")" +
            "</script>")
    void insertUser(Map<String, Object> map);
}
