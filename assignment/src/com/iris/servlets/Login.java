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

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

	    CustomerDao obj= new CustomerDaoImpl();
	    

		String s1=request.getParameter("id");
		int i= Integer.parseInt(s1);
		String s2=request.getParameter("password");
		Customer obj1;
		try {
			obj1 = obj.validateCustomer(i,s2);

			if(obj1== null) {
				out.println("<div align='center' style='color: red' > not registered</div>");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				
				rd.include(request,response);
				
				
			}
			
			else {
			
			request.setAttribute("customerObj", obj1);
			 if(obj1.getRole().equals("admin"))
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("AdminServlet");
					
					rd.include(request,response);
					
			 }
			
			
			
			 else
			 {
			RequestDispatcher rd=request.getRequestDispatcher("valid");
			
			rd.forward(request,response);
			
			 }
			
			}	
				
			
		}
		 catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}	
}
	

	
	
	
	
