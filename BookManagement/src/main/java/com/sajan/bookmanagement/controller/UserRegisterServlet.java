package com.sajan.bookmanagement.controller;

import com.sajan.bookmanagement.model.User;
import com.sajan.bookmanagement.service.UserRegistryService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        User user = new User(username, password, role);
//        System.out.println(user.getUserName() + user.getPassword());

        UserRegistryService service = new UserRegistryService();
        String userId = service.userCreation(user);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/successreg.jsp");
        req.setAttribute("userId", userId);
        requestDispatcher.forward(req, resp);
    }
}
