package com.zht.dao.mybatis.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderDao {

    @Insert("<script>" +
            "insert into " +
            "t_order " +
            "(" +
            "order_no," +
            "user_id," +
            "product_id," +
            "count," +
            "total_cost" +
            ") " +
            "values " +
            "<foreach collection='list' item='curr' separator=','>" +
            "(#{curr.order_no},#{curr.user_id},#{curr.product_id},#{curr.count},#{curr.total_cost})" +
            "</foreach>" +
            "</script>")
    public void insertIntoOrder(List<Map<String,Object>> dataList);
}
