package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.models.Customer;


@WebServlet("/valid")
public class Valid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Valid() {
        super();
       
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer obj1=(Customer)request.getAttribute("customerObj");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.println("<div align='center' style='color:green'>"
				+ "Welcome  "+ obj1.getCustomerName()+"</div>");
		
		int v=obj1.getCustomerId();
		String a=obj1.getCustomerName();
		String b=obj1.getGender();
		String c=obj1.getEmailAddress();
		String d=obj1.getPassword();
		String e=obj1.getCity();
		
		HttpSession session= request.getSession();
		
		session.setAttribute("id",v);
		session.setAttribute("name",a);
		session.setAttribute("gender",b);
		session.setAttribute("email address",c);
		session.setAttribute("password",d);
		session.setAttribute("city",e);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("menu.html");
		rd.include(request,response);
	}
	


}
