package com.example.services;

import com.example.entities.Food;

import java.util.List;

/**
 * Created by guang on 2017/4/25.
 */
public interface FoodService {
    public List<Food> findFoodsByMenuId(int menuId);
}
