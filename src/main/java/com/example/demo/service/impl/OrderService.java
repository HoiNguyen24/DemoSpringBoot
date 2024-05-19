package com.example.demo.service.impl;

import com.example.demo.model.Orders;
import com.example.demo.service.IOrderService;

import java.util.List;

public class OrderService implements IOrderService {
    @Override
    public List<Orders> findAll() {
        return null;
    }

    @Override
    public Orders findById(Long id) {
        return null;
    }

    @Override
    public void save(Orders orders) {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        orders.setId(number);
    }

    @Override
    public void remove(Long id) {

    }
}
