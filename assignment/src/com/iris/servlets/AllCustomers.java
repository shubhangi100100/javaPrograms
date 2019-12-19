package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.models.Customer;

@WebServlet("/AllCustomers")
public class AllCustomers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AllCustomers() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CustomerDao obj1= new CustomerDaoImpl();
		
		try {
			List<Customer> s= obj1.getAllCustomers();
			out.println("<html><body>");
			out.println("<div align='center' style='background-color:yellow' > ");
			out.println("<table border=1 style='width:100%' >");
			out.println("<tr>");
			out.println("<th> ID </th> <th> NAME </th> <th> GENDER </th> <th> Email Address </th> <th> PASSWORD </th> <th> CITY </th> <th> ROLE </th> <th colspan='2' > OPTIONS </th>");
			out.println("</tr>");
			for(Customer a:s) {
				out.println("<tr>");
				out.println("<td>" +a.getCustomerId()+ "</td>"
						+ " <td>"  +a.getCustomerName()+ "</td>"
						+ " <td>"  +a.getGender()+ "</td> "
						+ "<td>" +a.getEmailAddress()+ "</td>"
						+ " <td>" +a.getPassword()+ "</td>"
						+ " <td>" +a.getCity()+ "</td>"
						+ "<td>"  +a.getRole()+ "</td>"
						+ "<td> <a href='UpdateCustomer?myid=" +a.getCustomerId()+ " && mycity=" +a.getCity()+ "'> UpdateCustomer  </a> </td>"
						+ "<td> <a href='DeleteCustomer?myid=" +a.getCustomerId()+"'> Delete </a> </td>"
						);
				out.println("</tr>");	
	}
			
			out.println("</table>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			
	}
		catch (Exception e){
			e.printStackTrace();
			
	}
		
		
		
	}

	
	
}
