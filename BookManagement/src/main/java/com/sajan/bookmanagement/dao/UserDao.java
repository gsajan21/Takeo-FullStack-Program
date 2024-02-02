package com.sajan.bookmanagement.dao;

import com.sajan.bookmanagement.model.User;
import com.sajan.bookmanagement.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public String saveUser(User user) {

        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = null;
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
}
