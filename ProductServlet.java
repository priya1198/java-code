package com.shop;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductServlet extends HttpServlet {
    private final String[] products = {
        "Smartphone - $699",
        "Laptop - $999",
        "Headphones - $199",
        "Smartwatch - $299"
    };

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String selectedProduct = request.getParameter("product");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Shopping Cart</h1>");
        if (selectedProduct != null && !selectedProduct.isEmpty()) {
            out.println("<p>You added: <strong>" + selectedProduct + "</strong> to your cart.</p>");
        } else {
            out.println("<p>No product selected.</p>");
        }
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
