package com.sajan.order.feignclient;

import com.sajan.order.response.BookResponse;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BOOK-SERVICE")
public interface BookFeignClient {

    @GetMapping("/book/{bookId}")
    BookResponse getBookById(@PathVariable("bookId") Integer bookId);

//    @PutMapping("/book/updateBookOrder")
//    public ResponseEntity<?> updateBookById(@PathVariable("bookId") Integer bookId, @RequestBody BookRequest updateBookRequest);
//
//    @DeleteMapping("/book/deleteBookOrder")
//    public ResponseEntity<?> deleteBookById(@PathVariable("bookId") Integer bookId);
}
