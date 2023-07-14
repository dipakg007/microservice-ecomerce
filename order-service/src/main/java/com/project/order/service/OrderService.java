package com.project.order.service;

import com.project.order.dto.OrderRequest;
import com.project.order.entity.Order;
import org.springframework.stereotype.Service;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
