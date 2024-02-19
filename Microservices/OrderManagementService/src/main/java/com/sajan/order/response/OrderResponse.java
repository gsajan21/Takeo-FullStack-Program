package com.sajan.order.response;

import com.sajan.order.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private Long orderId;
    private String customerName;
    private Integer bookId;
    private OrderStatus orderStatus;
    private BookResponse bookResponse;
}
