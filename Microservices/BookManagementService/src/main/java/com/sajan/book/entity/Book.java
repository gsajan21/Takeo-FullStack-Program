package com.sajan.book.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String title;
    private String author;
    private Double price;
}
