package com.zht.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderDao {

    @Options(useGeneratedKeys=true)
    @Insert("<script>" +
            "insert into " +
            "t_order(" +
            "order_no," +
            "user_id," +
            "product_id," +
            "count," +
            "total_cost" +
            ")values(" +
            "#{order_no}," +
            "#{user_id}," +
            "#{product_id}," +
            "#{count}," +
            "#{total_cost} " +
            ")" +
            "</script>")
    void insertOrder(Map<String, Object> dataMap);

    @Select("<script>" +
            "select " +
            "id," +
            "order_no," +
            "user_id," +
            "product_id," +
            "count," +
            "total_cost " +
            "from " +
            "t_order " +
            "</script>")
    List<Map<String, Object>> selectAll();

}
