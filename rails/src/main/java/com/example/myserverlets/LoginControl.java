package com.example.myserverlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginControl extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform login validation here (e.g., check against a database).
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
    }
}
