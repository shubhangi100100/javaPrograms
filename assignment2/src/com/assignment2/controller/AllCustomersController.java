package com.assignment2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment2.Dao.CustomerDao;
import com.assignment2.Daosimpl.CustomerDaoImpl;
import com.assignment2.models.Customer;


@WebServlet("/AllCustomersController")
public class AllCustomersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AllCustomersController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CustomerDao obj1= new CustomerDaoImpl();
		List<Customer> s;
		try {
			s = obj1.getAllCustomers();
			System.out.println(s);
			request.setAttribute("clist", s);
			RequestDispatcher rd=request.getRequestDispatcher("AllCustomer.jsp");
			rd.forward(request,response);
			
			}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	
	
		
		
		
		
		
		
		
		
		
		
	}

	
	
}
