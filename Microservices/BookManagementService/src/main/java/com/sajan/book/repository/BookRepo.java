package com.sajan.book.repository;

import com.sajan.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
