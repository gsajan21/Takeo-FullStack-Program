package com.sajan.SpringProject.service;


import com.sajan.SpringProject.entity.Book;
import com.sajan.SpringProject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    @Autowired
    private EmployeeRepo bookRepo;


    public BookService(EmployeeRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    @Transactional
    public void saveBook(){
        Book book = new Book(1, "asdfasd", 657.34);
        bookRepo.save(book);

    }
}
