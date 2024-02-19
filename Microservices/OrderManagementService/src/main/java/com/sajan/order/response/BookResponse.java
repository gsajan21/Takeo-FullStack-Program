package com.sajan.order.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private Integer bookId;
    private String title;
    private String author;
    private Double price;

}
