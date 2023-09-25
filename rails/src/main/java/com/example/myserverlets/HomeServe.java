package com.example.myserverlets;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HomeServe extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
}