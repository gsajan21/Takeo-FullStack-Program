package com.sajan;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getAttribute("name");
        String salary = (String) req.getAttribute("salary");

        System.out.println("Name " + name);
        System.out.println("Salary "+ salary);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("sampleB");
        req.setAttribute("Name", "Sajan Gurung");
        req.setAttribute("Salary", "250000");

        requestDispatcher.forward(req, resp);




    }
}