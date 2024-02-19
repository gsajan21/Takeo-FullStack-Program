package com.sajan.order.entity;

import com.sajan.book.entity.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "order_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String customerName;
    private Integer bookId;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
