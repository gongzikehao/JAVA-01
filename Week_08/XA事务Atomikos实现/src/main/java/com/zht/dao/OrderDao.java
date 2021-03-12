package com.zht.dao;

import org.apache.ibatis.annotations.*;

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
            ")values(" +
            "#{orderNo}," +
            "#{userId}," +
            "#{productId}," +
            "#{count}," +
            "#{totalCost}" +
            ")" +
            "</script>")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertOrder(Map<String, Object> orderMap);

    @Select("select * from t_order")
    List<Map<String,Object>> selectAll();

    @Select("select * from t_order where product_id=#{productId}")
    List<Map<String,Object>> selectByProductId(int productId);

    @Delete("delete from t_order where 1=1")
    void deleteAll();

}
