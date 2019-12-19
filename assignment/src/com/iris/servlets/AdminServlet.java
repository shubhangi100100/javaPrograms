package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.models.Customer;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminServlet() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer obj1=(Customer)request.getAttribute("customerObj");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.println("<div align='center' style='color:green'>");
		out.println("welcome" + " " +obj1.getCustomerName());
		out.println("</div>");
		out.println("<hr/>");
		out.println("<div align='center' style='color:yellow' background color='green'>");
		out.println("<a href= 'AllCustomers'> view all customers </a>");
		out.println("</div>");
		
		
		
		
		
	}

	
	
}
