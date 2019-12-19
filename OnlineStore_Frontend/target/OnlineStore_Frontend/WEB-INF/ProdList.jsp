<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> all products </title>
</head>
<body>
<div align="center">
${msg}
<h1> all products</h1>
<table border="1">
		<tr>
		
			<th>Product Name</th>
				<th>Product Price</th>
				<th colspan="2">Options</th>
			</tr>
		
			
		
	
			<tr>
			<td>${pObj.productName}</td>
			<td>${pObj.price}</td>
		
			
		
			<td><a href="${pageContext.request.contextPath}/updateUser/${pObj.productName}">Update</a></td>
				<td><a href="${pageContext.request.contextPath}/deleteUser/${pObj.price}">Delete</a></td>
		</tr>
		
		</table>
</div>
</body>
</html>