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

<h1> all products</h1>
<table border="1">

		<tr>
		
			<th>Product Name</th>
				<th>Product Price</th>
				<th colspan="2">Options</th>
			</tr>
		
			
					
		   <c:forEach items="${msg}" var="plist">
	
			<tr>
			<td>${plist.productName}</td>
			<td>${plist.price}</td>
		
			<td><a href="${pageContext.request.contextPath}/updateUser/${plist.productName}">Update</a></td>
			<td><a href="${pageContext.request.contextPath}/deleteUser/${plist.price}">Delete</a></td>
		</tr>
		</c:forEach>
		</table>
</div>
</body>
</html>