package com.sajan.order.controller;

import com.sajan.order.entity.Order;
import com.sajan.order.entity.OrderRequest;
import com.sajan.order.response.OrderResponse;
import com.sajan.order.service.OrderServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> viewAllOrders(){
        List<Order> orders = orderService.listAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<?> viewOrderById(@PathVariable Long orderId){
        Optional<OrderResponse> order = orderService.listByOrderId(orderId);
        if (order.isPresent()) {
            return new ResponseEntity<>(order.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Order not found", HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/order")
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest){
        Optional<Order> order = orderService.createOrder(orderRequest);
        return order.isPresent() ?
                new ResponseEntity<>(order.get(), HttpStatus.CREATED) :
                new ResponseEntity<>("Cannot create an order", HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/order/{orderId}")
    public ResponseEntity<?> deleteOrderById(@PathVariable Long orderId){
        Optional<Order> order = orderService.deleteOrderById(orderId);
        return order.isPresent() ?
                new ResponseEntity<>(order.get(), HttpStatus.OK) :
                new ResponseEntity<>("Cannot find you order.", HttpStatus.NOT_FOUND);
    }

}
