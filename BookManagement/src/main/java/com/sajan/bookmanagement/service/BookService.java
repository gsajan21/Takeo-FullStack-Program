package com.sajan.bookmanagement.service;

import com.sajan.bookmanagement.dao.BookDao;
import com.sajan.bookmanagement.model.Book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<Book> getBooks(){
        BookDao bookDao = new BookDao();
        List<Book> books= new ArrayList<>();

        try {
            books = bookDao.getBooks();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    public Book getBookById(Integer bookId){
       BookDao bookDao = new BookDao();
        try {
            return bookDao.getBookById(bookId);
        } catch (SQLException e) {

        }
        return null;
    }



}
