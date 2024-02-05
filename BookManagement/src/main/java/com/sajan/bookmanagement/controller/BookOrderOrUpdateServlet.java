package com.sajan.bookmanagement.controller;

import com.sajan.bookmanagement.dao.BookDao;
import com.sajan.bookmanagement.model.Book;
import com.sajan.bookmanagement.service.BookService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/adminServlet")
public class BookOrderOrUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String [] s = req.getParameterValues("listofbookid");
        String buttonType = req.getParameter("buttonId");

        if("order".equalsIgnoreCase(buttonType)){

        } else if("update".equalsIgnoreCase(buttonType)){
            if(s.length == 1){
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("./updateBook.jsp");
                BookService bookService = new BookService();
                Book book = bookService.getBookById(Integer.valueOf(s[0]));
                req.setAttribute("books", book);
                requestDispatcher.forward(req, resp);
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer bookId = Integer.valueOf(req.getParameter("id"));
        String bookName = req.getParameter("bname");
        String bookDescription = req.getParameter("description");
        Integer bookPrice = Integer.valueOf(req.getParameter("price"));

        BookDao bookDao = new BookDao();
        boolean success = bookDao.updateBook(bookName, bookDescription, bookPrice, bookId);
        if(success) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bookUpdateSuccess.jsp");
            req.setAttribute("bookId", bookId);
            requestDispatcher.forward(req, resp);
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/failure.jsp");
        }

    }
}
