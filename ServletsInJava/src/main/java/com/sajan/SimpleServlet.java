package com.sajan;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Write the welcome message to the response
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h2>Welcome to Java Servlet!</h2>");
        resp.getWriter().println("</body></html>");
    }
}
