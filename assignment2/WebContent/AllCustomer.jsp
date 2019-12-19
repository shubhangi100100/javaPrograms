<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> all customers</title>
</head>
<body>
<form action="AllCustomersController" method="get">
</form>
<div align='center' style='background-color:yellow' >
<table border=1 style='width:100%' >
<tr>
<th> ID </th> 
<th> NAME </th>
<th> GENDER </th> 
<th> Email Address </th> 
<th> PASSWORD </th>
 <th> CITY </th> 
 <th> ROLE </th> 
 <th colspan='2' > OPTIONS </th>
</tr>
<c:forEach items="${clist}" var="s">
<tr>


<td>${s.customerId}</td>
<td>${s.customerName }</td>
<td>${s.gender }</td>
<td>${s.emailAddress }</td>
<td>${s.password }</td>
<td>${s.role }</td>
<td> <a href="updateCustomer.jsp"> Update</a></td>
<td> <a href="delete.jsp"> Delete</a></td>

</tr>
</c:forEach>
</body>
</html>