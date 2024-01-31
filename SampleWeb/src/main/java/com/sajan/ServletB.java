package com.sajan;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletB extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getAttribute("Name");
        String salary = (String) req.getAttribute("Salary");

        System.out.println("Name" + name);
        System.out.println("Salary "+ salary);
    }
}
