package com.sajan.bookmanagement.dao;

import com.sajan.bookmanagement.model.Book;
import com.sajan.bookmanagement.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks() throws SQLException {

        Connection connection = DBUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("Select * from Books");

        ResultSet resultSet = preparedStatement.executeQuery();
        List<Book> bookList = new ArrayList<>();

        while(resultSet.next()){
            Book book = new Book();
            book.setBookId(resultSet.getInt(1));
            book.setBookName(resultSet.getString(2));
            book.setBookDescription(resultSet.getString(3));
            book.setBookPrice(resultSet.getString(4));
            bookList.add(book);
        }

        return bookList;
    }
}
