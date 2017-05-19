package com.faros.services;

import my.faros.model.Order;
import net.minidev.json.JSONObject;

import java.util.List;

/**
 * Created by guang on 2017/5/8.
 */
public interface OrderService {
    void save(Order order);
    boolean checkApiStatus();
    List<JSONObject> findAll(int restaurantId);
    void changeOrderStatus(long id, String newStatus);
}
