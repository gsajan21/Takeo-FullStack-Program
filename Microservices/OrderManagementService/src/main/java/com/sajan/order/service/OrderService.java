package com.sajan.order.service;

import com.sajan.order.entity.Order;
import com.sajan.order.entity.OrderRequest;
import com.sajan.order.response.OrderResponse;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> listAllOrders();

    Optional<OrderResponse> listByOrderId(Long orderId);

    Optional<Order> createOrder(OrderRequest orderRequest);

    Optional<Order> deleteOrderById(Long orderId);
}
