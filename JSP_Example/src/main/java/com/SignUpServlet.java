package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieving form input values (email and password) from the request
        String email = req.getParameter("userEmailId");
        String password = req.getParameter("userPassword");

        /*
        // Example of directly writing a response to the client (not used here)
        resp.setContentType("text/html"); 
        PrintWriter writer = resp.getWriter();
        writer.append("Hi welcome " + email);
        */

        // Storing form values in the request object as attributes
        req.setAttribute("emailId", email);
        req.setAttribute("password", password);

        /*
         * Explanation:
         * 1. We are forwarding this data to another resource (result.jsp).
         * 2. Before forwarding, we store values in the request object using key-value pairs.
         *    - Key   → "emailId", "password"
         *    - Value → user input from the form
         * 3. By setting attributes in the request, JSP can later access them.
         * 4. JSP pages can retrieve these values using request.getAttribute("key").
         * 5. HTML itself does not "know" about the request or response — JSP does.
         */

        // Forwarding the request and response to result.jsp
        RequestDispatcher rp = req.getRequestDispatcher("result.jsp");
        rp.forward(req, resp);
    }
}

/*
 * Additional Note:
 * - To send data (like userId and password) to the next resource,
 *   we set them as request attributes and forward the request
 *   using RequestDispatcher.
 */
