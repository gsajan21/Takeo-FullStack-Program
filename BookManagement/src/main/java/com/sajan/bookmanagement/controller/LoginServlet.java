package com.sajan.bookmanagement.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Check if the credentials are valid (for demonstration purposes, checking against hardcoded values)
        if ("sajan".equals(username) && "enter".equals(password)) {
            // If valid, create a session and store the username
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome.jsp");
            req.setAttribute("username", username);
            requestDispatcher.forward(req, resp);

            // Redirect to the success page
            resp.sendRedirect("welcome.jsp");
        } else {
            // If invalid, redirect to the failure page
            resp.sendRedirect("failure.jsp");
        }
    }
}
