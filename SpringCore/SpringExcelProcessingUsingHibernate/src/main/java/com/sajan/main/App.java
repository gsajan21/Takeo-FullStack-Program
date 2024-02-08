package com.sajan.main;

import com.sajan.config.Config;
import com.sajan.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        EmployeeServiceImpl employeeService = (EmployeeServiceImpl) applicationContext.getBean("employeeServiceImpl");

        try {
            File file = new File("Employee.xlsx");
            System.out.println("==============");
            System.out.println("1. Update\n2. Read from Excel\n3. Write to Excel");
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            if (userInput == 1) {
                employeeService.updateEmployee();
            } else if (userInput == 2) {
                employeeService.readFromExcel(file);
            } else if (userInput == 3) {
                employeeService.writeToExcel();
            } else{
                System.out.println("Please try again.");
            }
        } catch (IOException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
