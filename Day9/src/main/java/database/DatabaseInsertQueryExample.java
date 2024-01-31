package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInsertQueryExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/takeodb", "sajan", "enter@123");

        Statement statement = connection.createStatement();
        statement.execute("insert into Employee (empId, empName, empAddress, empSalary) values(2, 'Randy', 'Nepal', 500000 )");

        System.out.println("Record has been inserted.");
        statement.close();
        connection.close();
    }
}
