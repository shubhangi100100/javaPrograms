<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>	 SIGN UP</title>
</head>
<body>

<div align="center">
<h1> sign up here</h1>
</hr>
<f:form action="Successful" method="POST" modelAttribute="uObj">
<table>
<tr>
<td> UserId: </td>
<td><f:input path="userId"/></td>
</tr>
<tr>
<td> UserName: </td>
<td><f:input path="userName"/></td>
</tr>
</table>
<tr>
<td> Password: </td>
<td><f:password path="password"/></td>
</tr>
<tr>
<td> Gender: </td>
<td><f:input path="gender"/></td>
</tr>
<tr>
<td> SUBMIT </td>
<td><input type="submit" value="signUp"/></td>
</tr>
</div>

</f:form>
</body>
</html>