package com.zht.service;

import java.util.List;
import java.util.Map;

public interface OrderService {
    String testLocalTransactionSucceed();
    String testLocalTransactionFailed();
    String testDistributeTransactionSucceed();
    String testDistributeTransactionFailed();
    void addOrder(Map<String, Object> orderMap);
    List<Map<String,Object>> getByProductId(int productId);
    List<Map<String,Object>> getAll();
    void removeAll();
}
