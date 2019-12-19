package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.models.Customer;


@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteCustomer() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String a= request.getParameter("myid");
		CustomerDao obj1= new CustomerDaoImpl();
		Customer obj= new Customer();
		
		int i= Integer.parseInt(a);
		obj.setCustomerId(i);
		
		boolean z;
		try {
			z= obj1.deleteCustomer(i);
			if(z == true)
			{
				out.println("<html> <body> <div align= 'center' style='color: green; font:bold; font-size:50px'>  user deleted successfully </div></body></html>");
				
				RequestDispatcher rd=request.getRequestDispatcher("AllCustomers");
				rd.include(request,response);
				
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		

	
		
		
	}

	
	
}
