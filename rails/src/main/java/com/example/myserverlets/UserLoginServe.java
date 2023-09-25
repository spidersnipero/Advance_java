// writing serverlet code to serve index.html at url /index.html

package com.example.myserverlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class UserLoginServe extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/userlogin.jsp").forward(request, response);
    }
}


