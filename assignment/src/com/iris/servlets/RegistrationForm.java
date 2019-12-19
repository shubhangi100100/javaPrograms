package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.models.Customer;

@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static CustomerDao obj= new CustomerDaoImpl();
       
    public RegistrationForm() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Customer obj1= new Customer();
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		String s4=request.getParameter("t4");
		String s5=request.getParameter("t5");
		String s6=request.getParameter("t6");
		
		int i= Integer.parseInt(s1);
		obj1.setCustomerId(i);
		obj1.setCustomerName(s2);
		obj1.setGender(s3);
		obj1.setEmailAddress(s4);
		obj1.setPassword(s5);
		obj1.setCity(s6);
		
		
		
		boolean n;
		try {
			n= obj.registerCustomer(obj1);
			if (n==true)
			out.println(obj1);
			else
			out.println("not registered");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
		
		
	}

	

}
