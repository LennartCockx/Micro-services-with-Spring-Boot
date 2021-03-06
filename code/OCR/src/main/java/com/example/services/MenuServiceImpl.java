package com.example.services;

import com.example.entities.Menu;
import com.example.entities.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guang on 2017/4/25.
 */
@Service("MenuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;
    @Override
    public List<Menu> findMenuByRestaurantId(int restaurantId) {
        return menuRepository.findMenuByRestaurantId(restaurantId);
    }

    @Override
    public void addMenu(Menu menu) {
        menuRepository.save(menu);
    }
}
