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
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("username "+ username);
        System.out.println("password "+ password);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome.jsp");
        req.setAttribute("username", username);
        requestDispatcher.forward(req, resp);

    }
}
