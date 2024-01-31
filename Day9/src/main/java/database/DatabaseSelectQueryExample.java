package database;


import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatabaseSelectQueryExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/takeodb", "sajan", "enter@123");

        Statement statement = connection.createStatement();
        List<Object> list = Collections.singletonList(statement.execute("select * from employee"));

        for(Object a : list){
            System.out.println(a);
        }

        System.out.println("Record has been inserted.");
        statement.close();
        connection.close();
    }
}
