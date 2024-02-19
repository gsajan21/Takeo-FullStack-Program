package com.sajan.order.service;

import com.sajan.order.entity.Order;
import com.sajan.order.entity.OrderRequest;
import com.sajan.order.feignclient.BookFeignClient;
import com.sajan.order.repository.OrderRepo;
import com.sajan.order.response.BookResponse;
import com.sajan.order.response.OrderResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepo orderRepo;
    private final ModelMapper modelMapper;
    private final BookFeignClient bookFeignClient;

    public OrderServiceImpl(OrderRepo orderRepo, ModelMapper modelMapper, BookFeignClient bookFeignClient) {
        this.orderRepo = orderRepo;
        this.modelMapper = modelMapper;
        this.bookFeignClient = bookFeignClient;
    }

    @Override
    public List<Order> listAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Optional<OrderResponse> listByOrderId(Long orderId) {
        Optional<Order> byId = orderRepo.findById(orderId);
        if(byId.isPresent()) {
            OrderResponse orderResponse = modelMapper.map(byId.get(), OrderResponse.class);
            BookResponse bookById = bookFeignClient.getBookById(Math.toIntExact(orderId));
            orderResponse.setBookResponse(bookById);
            return Optional.of(orderResponse);
        }else
            return Optional.empty();
    }

    @Override
    public Optional<Order> createOrder(OrderRequest orderRequest) {
        if (orderRequest == null) {
            return Optional.empty();
        }
        // Map the order request to an Order entity
        Order order = new Order();
        modelMapper.map(orderRequest, order);
        Order savedOrder = orderRepo.save(order);

        return Optional.of(savedOrder);
    }

    @Override
    public Optional<Order> deleteOrderById(Long orderId) {
        Optional<Order> orderToDelete = orderRepo.findById(orderId);
        orderToDelete.ifPresent(orderRepo::delete);
        return orderToDelete;
    }
}
