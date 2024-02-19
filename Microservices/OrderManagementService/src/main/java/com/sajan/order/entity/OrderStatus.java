package com.sajan.order.entity;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
public enum OrderStatus {
    NEW("New"),
    PROCESSING("Processing"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private final String status;

}
