package com.vikas.tagms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vikas.tagms.entity.User;

public class UserService {

    // Create User
    // User will purchgase Book
    // User will see status of purchase
    // user will see status of payment.

    Map<Long,User>userIdUserMap = new HashMap<>();
    Long userId = 1L;


    public User createUser(String name, String type){
        User user = User.builder().name(name).id(userId).type(type).build();
        userIdUserMap.put(userId, user);
        return user;
    }

    public User getUser(Long userId){
        return userIdUserMap.get(userId);
    }

    public List<Long> getUserOrderHistory(Long userId){
        User user = userIdUserMap.get(userId);
        return user.getOrderIdList();
    }
}
