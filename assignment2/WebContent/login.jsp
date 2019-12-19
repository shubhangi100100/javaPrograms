<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title> Welcome User</title>
</head>
<body>
<form action="LoginController" method="get">
<div align=center style=background-color:lightblue>
<h1> Login Form </h1>
<img src="images\\3.jpg" alt="none" height="50%" width="50%">


   

<table>
<tr>
<td> ID: </td>
<td><input type="text" name="id" />
</td>
</tr>
<tr>
<td> Password: </td>
<td><input type="password" name="password" />
</td>
</tr>
<tr>
<td> </td>
<td><input type="submit" value= login />
</td>
</tr>

</table>
</div>
</form>
</body>
</html>