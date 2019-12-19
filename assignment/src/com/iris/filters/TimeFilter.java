package com.iris.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class TimeFilter implements Filter {

    
    public TimeFilter() {
     
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		LocalDateTime obj=LocalDateTime.now();
		int hour=obj.getHour();
		
		if((hour>=13)&&(hour<=15)){
			out.println("U cant access the application between 1 to 3");
		}
		else {
			chain.doFilter(request, response);
		}
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
