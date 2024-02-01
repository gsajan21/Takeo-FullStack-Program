package com.filter;

import jakarta.servlet.*;

import java.io.IOException;


public class FilterA implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(request.getParameter("username"));
        String username = request.getParameter("username");
        if(username.equals("sajan")){
            chain.doFilter(request,response);
        }else {

        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
