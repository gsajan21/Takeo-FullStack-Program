package com.sajan.bookmanagement.controller;

import com.sajan.bookmanagement.dao.UserDao;
import com.sajan.bookmanagement.model.User;
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

        UserDao userDao = new UserDao();
        User authenticationOfUser = userDao.getAuthenticationOfUser(username, password);
        if (authenticationOfUser != null) {
            String userRole = authenticationOfUser.getRole();
            if ("admin".equalsIgnoreCase((userRole))) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bookServlet");
                req.setAttribute("role", authenticationOfUser.getRole());
//                req.setAttribute("username", username);
                requestDispatcher.forward(req, resp);
            } else if ("user".equalsIgnoreCase(userRole)) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bookServlet");
                req.setAttribute("role", authenticationOfUser.getRole());
//                req.setAttribute("username", username);
                requestDispatcher.forward(req, resp);;
            } else{
                resp.sendRedirect("failure.jsp");
            }

        } else {
            // If invalid, redirect to the failure page
            resp.sendRedirect("failure.jsp");
        }
    }
}
