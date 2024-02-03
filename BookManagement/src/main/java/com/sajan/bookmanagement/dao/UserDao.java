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

    public User getAuthenticationOfUser(String username, String password) {
        try {
            // Prepare SQL query to check for username and password
            preparedStatement = connection.prepareStatement("select * from User where user_name=? and password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User();
                    user.setUserName(username);
                    user.setPassword(password);
                    user.setRole(resultSet.getString("role"));
                    return user;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

//    public boolean authenticateUser(String username, String password) {
//
//        String sqlQuery = "select * from User";
//        Map <String, String> userHashMap = new HashMap();
//        try {
//            // Prepare SQL query to check for username and password
//            preparedStatement = connection.prepareStatement(sqlQuery);
//
//            // Execute the query and get the result set
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while(resultSet.next()){
//                userHashMap.put(resultSet.getString(2), resultSet.getString(3));
//            }
//
//        } catch (SQLException e) {
//            return false;
//        }finally {
//            DBUtil.closeConnection();
//            DBUtil.closePreparedStatement(preparedStatement);
//        }
//
//        return userHashMap.containsKey(username) && userHashMap.get(username).equals(password);
//
//    }
}
