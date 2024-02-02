package com.sajan.bookmanagement.dao;

import com.sajan.bookmanagement.model.Book;
import com.sajan.bookmanagement.model.User;
import com.sajan.bookmanagement.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserDao {
    static Connection connection = DBUtil.getConnection();
    static PreparedStatement preparedStatement = null;

    public String saveUser(User user) {

        try {
            preparedStatement = connection.prepareStatement("Insert into User(user_id, user_name, password, role) values (?,?,?,?)");
            preparedStatement.setString(1, user.getUserId());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getRole());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection();
            DBUtil.closePreparedStatement(preparedStatement);
        }

        return user.getUserId();
    }

//    public boolean authenticateUser(String username, String password) {
//        try {
//            // Prepare SQL query to check for username and password
//            preparedStatement = connection.prepareStatement("SELECT * FROM User WHERE username=? AND password=?");
//            preparedStatement.setString(1, username);
//            preparedStatement.setString(2, password);
//
//            // Execute the query and get the result set
//            try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                // If a row is found in the result set, the user is authenticated
//                return resultSet.next();
//            } catch (SQLException e) {
//                // Handle any SQLException that may occur during result set processing
//                return false;
//            }
//        } catch (SQLException e) {
//            // Handle any SQLException that may occur during query preparation
//            throw new RuntimeException(e);
//        }
//    }

    public boolean authenticateUser(String username, String password) {

        String sqlQuery = "select * from User";
        Map <String, String> userHashMap = new HashMap();
        try {
            // Prepare SQL query to check for username and password
            preparedStatement = connection.prepareStatement(sqlQuery);

            // Execute the query and get the result set
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                userHashMap.put(resultSet.getString(2), resultSet.getString(3));
            }

        } catch (SQLException e) {
            return false;
        }

        return userHashMap.containsKey(username) && userHashMap.get(username).equals(password);

    }
}
