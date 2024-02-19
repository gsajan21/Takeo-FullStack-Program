package com.sajan.book.controller;

import com.sajan.book.entity.Book;
import com.sajan.book.entity.BookRequest;
import com.sajan.book.service.BookServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> viewAllBooks(){
        List<Book> books = bookService.listBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    @GetMapping("/book/{bookId}")
    public ResponseEntity<Book> viewBook(@PathVariable Integer bookId){
        Optional<Book> bookOptional = bookService.listBookById(bookId);
        return bookOptional.map(book ->
                new ResponseEntity<>(book, HttpStatus.OK))
                .orElseGet(() ->
                        new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody BookRequest newBookRequest){
        bookService.addBook(newBookRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBookRequest);
    }

    @PutMapping("/book/{bookId}")
    public ResponseEntity<?> updateBookById(@PathVariable Integer bookId, @RequestBody BookRequest updateBookRequest){
        Optional<Book> updatedBook = bookService.updateBookById(bookId, updateBookRequest);

        if (updatedBook.isPresent()) {
            return ResponseEntity.ok(updatedBook.get()); // Return updated book with 200 OK status
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found if book with given ID does not exist
        }
    }
    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<?> deleteBookById(@PathVariable Integer bookId){
        Optional<Book> deletedBookById = bookService.deleteBookById(bookId);
        return deletedBookById.map(book ->
                new ResponseEntity<>(book, HttpStatus.OK))
                .orElseGet(() ->
                        new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

}
