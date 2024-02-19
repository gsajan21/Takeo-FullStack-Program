package com.sajan.book.service;

import com.sajan.book.entity.Book;
import com.sajan.book.entity.BookRequest;
import com.sajan.book.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    @Override
    public List<Book> listBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> listBookById(Integer bookId) {
        return bookRepo.findById(bookId);
    }

    @Override
    public String addBook(BookRequest newBook) {
        Book addBook = new Book();
        try {
            addBook.setTitle(newBook.getTitle());
            addBook.setAuthor(newBook.getAuthor());
            addBook.setPrice(newBook.getPrice());
//            BeanUtils.copyProperties(addBook, newBook);
            bookRepo.save(addBook);
            return "Data copied successfully ";
        } catch (Exception e) {
            return "Error copying properties";
        }
    }

    @Override
    public Optional<Book> updateBookById(Integer bookId, BookRequest updateBookRequest) {
        try {
            Optional<Book> optionalBook = bookRepo.findById(bookId);
            if (optionalBook.isPresent()) {
                Book updateBook = optionalBook.get();
                updateBook.setTitle(updateBookRequest.getTitle());
                updateBook.setAuthor(updateBookRequest.getAuthor());
                updateBook.setPrice(updateBookRequest.getPrice());
                bookRepo.save(updateBook);

                return Optional.of(updateBook);
            } else {
                return Optional.empty();
            }
        } catch (Exception e) {
            return Optional.empty(); // Return empty optional if update fails
        }
    }

    @Override
    public Optional<Book> deleteBookById(Integer bookId) {
        try{
            Optional<Book> bookById = bookRepo.findById(bookId);

            if(bookById.isPresent()) {
                Book deleteBook = bookById.get();
                bookRepo.delete(deleteBook);
                return Optional.of(deleteBook);
            }else {
                return Optional.empty();
            }
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
