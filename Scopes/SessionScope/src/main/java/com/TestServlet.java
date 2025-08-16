package com;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/signup") 
public class TestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("password", password);
        
        RequestDispatcher rp = req.getRequestDispatcher("result.jsp");
        rp.forward(req, resp);
        
        
    }
}
