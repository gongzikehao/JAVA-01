package com.zht.dao.mybatis.dao;

import com.zht.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestDao {

    @Autowired
    OrderDao orderDao;

    @Test
    public void test(){

        long start = System.nanoTime();
        List<Map<String, Object>> dataList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Map<String, Object> order = new HashMap<>();
            order.put("order_no", i + "");
            order.put("user_id", i);
            order.put("product_id", i);
            order.put("count", i);
            order.put("total_cost", 8.88);
            dataList.add(order);
        }
        orderDao.insertIntoOrder(dataList);
        long end = System.nanoTime();
        //27秒
        System.out.println("耗时：" + TimeUnit.NANOSECONDS.toSeconds(end - start) + "秒！");
    }


}
