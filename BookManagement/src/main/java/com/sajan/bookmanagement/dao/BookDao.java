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

        PreparedStatement preparedStatement = connection.prepareStatement("Select * from Book");

        ResultSet resultSet = preparedStatement.executeQuery();
        List<Book> bookList = new ArrayList<>();

        while(resultSet.next()){
            Book book = new Book();
            book.setBookId(resultSet.getInt(1));
            book.setBookName(resultSet.getString(2));
            book.setBookDescription(resultSet.getString(3));
            book.setBookPrice(resultSet.getInt(4));
            bookList.add(book);
        }

        return bookList;
    }
    public boolean updateBook(String bookName, String bookDescription, Integer bookPrice, Integer bookId)  {
        Connection connection = DBUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update book set book_name=?,book_description=?, book_price=? where book_id=?");
            preparedStatement.setString(1, bookName);
            preparedStatement.setString(2, bookDescription);
            preparedStatement.setInt(3, bookPrice);
            preparedStatement.setInt(4, bookId);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeConnection();
        }
        return false;
    }

    public Book getBookById(Integer bookId) throws SQLException {
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("Select * from book where book_id=?");
        preparedStatement.setInt(1, bookId);
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book  = new Book();
        while(resultSet.next()){
            book.setBookId(resultSet.getInt(1));
            book.setBookName(resultSet.getString(2));
            book.setBookDescription(resultSet.getString(3));
            book.setBookPrice(resultSet.getInt(4));
        }
        return book;

    }
}
