package com.vikas.tagms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vikas.tagms.entity.Order;
import com.vikas.tagms.utils.OrderStatus;

public class OrderService {

    Map<Long,Order>orderIdOrderMap = new HashMap<>();
    Long orderId = 1L;

    private BooksService booksService;


    public Order createOrder(Long userId, List<Long>bookIdList){

        Double totalAmount = booksService.getBooksPrice(bookIdList);

        Order order = Order.builder().bookIdList(bookIdList).id(orderId).userId(userId).totalAmount(totalAmount).build();
        orderIdOrderMap.put(orderId, order);

        return order;
    }

    public OrderStatus getOrderStatus(Long orderId){
        return orderIdOrderMap.get(orderId).getStatus();
    }


}
