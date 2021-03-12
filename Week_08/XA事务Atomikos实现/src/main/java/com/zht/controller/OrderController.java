package com.zht.controller;

import com.zht.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("addOrder")
    public String addOrder(@RequestBody Map<String, Object> reqMap) {
        orderService.addOrder(reqMap);
        return "add ok!";
    }

    @RequestMapping("removeAll")
    public String removeAll() {
        orderService.removeAll();
        return "removeAll ok!";
    }

    @RequestMapping("testLocalTransactionSucceed")
    public String testLocalTransactionSucceed() {
        return orderService.testLocalTransactionSucceed();
    }

    @RequestMapping("testLocalTransactionFailed")
    String testLocalTransactionFailed() {
        try {
            orderService.testLocalTransactionFailed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Map<String, Object>> list = orderService.getByProductId(222);
        System.out.println(list);
        if (list.size() == 1)
            return "本地事务，同库同表抛出异常插入一条成功...";
        return "本地事务，同库同表抛出异常插入数据失败...";
    }

    @RequestMapping("testDistributeTransactionSucceed")
    String testDistributeTransactionSucceed() {
        return orderService.testDistributeTransactionSucceed();
    }

    @RequestMapping("testDistributeTransactionFailed")
    String testDistributeTransactionFailed() {
        try {
            orderService.testDistributeTransactionFailed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Map<String, Object>> list1 = orderService.getByProductId(555);
        List<Map<String, Object>> list2 = orderService.getByProductId(666);
        System.out.println(list1);
        System.out.println(list2);
        if (list1.size() != 0 && list2.size() != 0) {
            return "XA事务，不同库均插入成功！";
        }
        if (list1.size() == 0 && list2.size() == 0) {
            return "XA事务，不同库均插入失败！";
        }
        return "XA事务，不同库一条成功，一条失败！";
    }

    @RequestMapping("getAll")
    public List<Map<String, Object>> getAll() {
        return orderService.getAll();
    }

}
