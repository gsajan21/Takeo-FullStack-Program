package com.sajan.bookmanagement.controller;

import com.sajan.bookmanagement.model.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/adminServlet")
public class BookOrderOrUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books = new ArrayList<>();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("admin.jsp");
        req.setAttribute("books", books);
        requestDispatcher.forward(req, resp);

    }
}
