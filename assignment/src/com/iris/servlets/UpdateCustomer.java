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


@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UpdateCustomer() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		
        out.println("<html><body>" );

        out.println("<div align='center' style='background-color:lightgreen'>");
        out.println("<h1> REGISTERATION FORM </h1>");
        out.println("<hr/>");
        out.println("<form action='UpdateCustomer' method=get>");
        out.println("<table>");
        out.println("<tr>");
    	out.println("<td> Customer Id: </td>");
    	out.println("<td>");
    	out.println("<input type='text' name='t1' >");
    	out.println("</td>");
    	out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Customer Name: </td>");	
		out.println("<td>");
		out.println("<input type='text' name='t2'/>");
		out.println("</td>");
        
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td> Gender: </td>");
        out.println("<td>");
        
		out.println("<input type='radio' name='t3' value='male' >" );
		out.println("<input type='radio' name='t3' value='female'>");
		out.println("<br>");
		out.println("</td>");
		out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td> EmailAddress: </td>");
		 out.println("<td>");
		 out.println("<input type=\"email\" name=\"t4\" />")	;
		 out.println("</td>")	;
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td> Password: </td>");
		 out.println("<td>");
		 out.println("<input type=\"password\" name=\"t5\" />");
		 out.println("</td>");
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td> City: </td>");
		 out.println("<td>");
		 out.println("<select name=\"t6\">");
		 out.println("<option>Delhi</option>");
		 out.println("<option>Lucknow</option>");
		 out.println("<option>Nanital</option>");
		 out.println("<option>Mumbai</option>");
		 out.println("<option>Banglore</option>");
		 out.println("</select>");
		 out.println("</td>");
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td></td>");	
		 out.println("<td>");	
		 out.println("	<input type=\'submit\' name=\'t7\' value=\'submit\'>");
		 out.println("</td>");
		 out.println("</tr>");
		 out.println("</table>");
		 out.println("</form>");
		 out.println("</div>");
		 out.println("</body>");
		 out.println("</html>");
		 
		 CustomerDao obj1= new CustomerDaoImpl();
			Customer obj= new Customer();
				
			String a= request.getParameter("myid");
			int i=Integer.parseInt(a);

		

			String b= request.getParameter("t2");
			String c= request.getParameter("t3");
			String d= request.getParameter("t4");
			String f= request.getParameter("t5");
			String g= request.getParameter("t6");
			
		
			
			
		
		 obj.setCustomerName(b);
		 obj.setGender(c);
		 obj.setEmailAddress(d);
		 obj.setPassword(f);
		 obj.setCity(g);
		 obj.setCustomerId(i);
		boolean r;
		try {
			r=obj1.updateCustomer(obj);
			
			if(r== true)
			{
				out.println("<html> <body> <div align= 'center' style='color: green; font:bold; font-size:50px'>  user updated successfully </div></body></html>");
				
			}
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

	
}
