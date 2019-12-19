package com.iris.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


//@WebFilter({"/valid", "/ViewProfile", "/DeleteCustomer", "/UpdateCustomer"} )
public class SessionFilter implements Filter {

    
    public SessionFilter() {
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;                //downcast
		HttpSession session=  req.getSession(false);
		
		
		
		
		if(session== null)
			{
			out.println("Start from index page");
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		else
		{
		chain.doFilter(request, response);
	}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
