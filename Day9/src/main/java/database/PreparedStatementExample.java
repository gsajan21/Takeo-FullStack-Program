package database;

import java.sql.SQLException;

public class PreparedStatementExample {
    public void insertRecord(int empId, String empNme, String empAddress, int empSalary) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

    }
}
