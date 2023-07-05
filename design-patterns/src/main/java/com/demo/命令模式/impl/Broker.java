package com.demo.命令模式.impl;

import com.demo.命令模式.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}