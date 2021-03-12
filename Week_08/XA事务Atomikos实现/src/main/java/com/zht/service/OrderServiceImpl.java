package com.zht.service;

import com.zht.dao.OrderDao;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.apache.shardingsphere.transaction.core.TransactionTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public String testLocalTransactionSucceed() {
        //本地事务，同库同表，插入成功！
        HashMap<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderNo", "local_succeed");
        orderMap.put("userId", 111);
        orderMap.put("productId", 111);
        orderMap.put("count", 111);
        orderMap.put("totalCost", 111.111);
        orderDao.insertOrder(orderMap);
        orderMap.put("orderNo", "local_succeed_succeed");
        orderMap.put("userId", 111);
        orderMap.put("productId", 111);
        orderMap.put("count", 111);
        orderMap.put("totalCost", 111.111);
        orderDao.insertOrder(orderMap);

        List<Map<String, Object>> list = orderDao.selectByProductId(111);
        System.out.println(list);
        if (list.size() == 2)
            return "本地事务，同库同表插入产品111成功...";
        return "本地事务，同库同表数据插入产品111失败...";
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String testLocalTransactionFailed() {
        //本地事务，同库同表，插入失败！
        HashMap<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderNo", "local_failed");
        orderMap.put("userId", 222);
        orderMap.put("productId", 222);
        orderMap.put("count", 222);
        orderMap.put("totalCost", 222.222);
        orderDao.insertOrder(orderMap);
        int i = 1/0;
        return "ok";
    }

    @Override
    public String testDistributeTransactionSucceed() {
        TransactionTypeHolder.set(TransactionType.XA);
        //不同库，两个库均插入成功
        HashMap<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderNo", "distribute_succeed");
        //ds1库
        orderMap.put("userId", 333);
        orderMap.put("productId", 333);
        orderMap.put("count", 333);
        orderMap.put("totalCost", 333.333);
        orderDao.insertOrder(orderMap);
        orderMap.put("orderNo", "distribute_succeed");
        //ds0库
        orderMap.put("userId", 444);
        orderMap.put("productId", 444);
        orderMap.put("count", 444);
        orderMap.put("totalCost", 444.444);
        orderDao.insertOrder(orderMap);

        List<Map<String, Object>> list1 = orderDao.selectByProductId(333);
        List<Map<String, Object>> list2 = orderDao.selectByProductId(444);
        if (list1.size() != 0 && list2.size() != 0)
            return "XA事务，不同库均插入成功！";
        return "XA事务，不同库均插入失败！";
    }

    @Override
    public String testDistributeTransactionFailed() {
        TransactionTypeHolder.set(TransactionType.XA);
        //不同库，两个库一个库插入成功，一个库插入失败
        HashMap<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderNo", "distribute_failed");
        //ds1库，成功
        orderMap.put("userId", 555);
        orderMap.put("productId", 555);
        orderMap.put("count", 555);
        orderMap.put("totalCost", 555.555);
        orderDao.insertOrder(orderMap);

        orderMap.put("orderNo", "distribute_failed");
        //ds0库，失败
        orderMap.put("userId", 666);
        orderMap.put("productId", 666);
        orderMap.put("count", 666);
        orderMap.put("totalCost", 666.666);
        orderDao.insertOrder(orderMap);
        int i = 1/0;

        return "ok";
    }

    @Override
    public void addOrder(Map<String, Object> orderMap) {
        orderDao.insertOrder(orderMap);
    }

    @Override
    public List<Map<String, Object>> getByProductId(int productId) {
        return orderDao.selectByProductId(productId);
    }

    @Override
    public List<Map<String, Object>> getAll() {
        return orderDao.selectAll();
    }

    @Override
    public void removeAll() {
        orderDao.deleteAll();
    }

}
