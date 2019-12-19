package com.assignment2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assignment2.Dao.CustomerDao;
import com.assignment2.Daosimpl.CustomerDaoImpl;
import com.assignment2.models.Customer;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			CustomerDao obj= new CustomerDaoImpl(); 
		    HttpSession session=request.getSession();
		    
			String s1=request.getParameter("id");
			int i= Integer.parseInt(s1);
			String s2=request.getParameter("password");
			
			try {
				Customer obj1= obj.validateCustomer(i, s2);
				session.setAttribute("obj1", obj1);

				if(obj1== null) {
					out.println("you are not registered");
					RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
					
					rd.include(request, response);
				
				}
				else {
					request.setAttribute("Obj1", obj1);
					if(obj1.getRole().equals("admin")) {
						out.println("welcome admin");
						RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
						rd.forward(request, response);
					}
					else {
						out.println("welcome" +obj1.getCustomerName() );
						RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
						rd.forward(request, response);
						
					}
					}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
	}
}

	
	

