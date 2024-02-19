package com.sajan.book.service;


import com.sajan.book.entity.Book;
import com.sajan.book.entity.BookRequest;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> listBooks();
    Optional<Book> listBookById(Integer bookId);
    String addBook(BookRequest newBook);
    Optional<Book> updateBookById(Integer bookId, BookRequest updateBookRequest);
    Optional<Book> deleteBookById(Integer bookId);
}
