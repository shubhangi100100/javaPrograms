package com.assignment2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment2.Dao.CustomerDao;
import com.assignment2.Daosimpl.CustomerDaoImpl;
import com.assignment2.models.Customer;


@WebServlet("/RegisterationController")
public class RegisterationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterationController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		int s1=Integer.parseInt(request.getParameter("id"));
		String s2=request.getParameter("name");
		String s3=request.getParameter("gen");
		String s4=request.getParameter("email");
		String s5=request.getParameter("password");
		String s6=request.getParameter("city");
		
		Customer obj1= new Customer(s1, s2, s3, s4, s5, s6);
		
		CustomerDao obj= new CustomerDaoImpl();
		try {
			boolean a= obj.registerCustomer(obj1);
			if(a== true) {
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			
		
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("registrationForm.jsp");
		rd.include(request,response);
		
		
	
		
		
	}

}
