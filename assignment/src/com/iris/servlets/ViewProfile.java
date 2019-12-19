package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/ViewProfile")
public class ViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ViewProfile() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		HttpSession session= request.getSession();
		Integer v=(Integer)session.getAttribute("id");
		String a=(String)session.getAttribute("name");
		String b=(String)session.getAttribute("gender");
		String c=(String)session.getAttribute("email");
		String d=(String)session.getAttribute("password");
		String e=(String)session.getAttribute("city");
		
		out.println("Your ID is: " +v
				+" hello your name is: " +a
				+" gender is: " +b
				+" email address is: " +c
				+" password is: " +d
				+" you belong to the city: " +e);
		
		
		

		
		
	}
	
}
