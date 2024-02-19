package com.sajan.order.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {
    private String customerName;
    private Integer bookId;
    private OrderStatus orderStatus;
}
