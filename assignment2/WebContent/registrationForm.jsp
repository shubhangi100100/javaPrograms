<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<
<div align="center" style="background-color:lightblue">
<h1> Registration Form </h1>
<hr/>

<form action="RegisterationController" method="post"> 

<table>
			<tr>
				<td>Customer Id: </td>
				<td>
				<input type="text" name="id" />
				</td>
			</tr>
			<tr>
				<td> Customer Name: </td>
				<td>
				<input type="text" name="name" />
				</td>
			</tr>
			<tr>
				<td> Gender: </td>
				<td>
				<input type="radio" name="gen" 
				value="male"/> male <br>
				<input type="radio" name="gen" 
				value="female"/> female <br>
				
				
				</td>
			</tr>
			<tr>
				<td> EmailAddress: </td>
				<td>
				<input type="text" name="email" />
				</td>
			</tr>
			<tr>
				<td> Password: </td>
				<td>
				<input type="password" name="password" />
				</td>
			</tr>
			<tr>
				<td> City: </td>
				<td>
				<select name="city">
				<option>Delhi</option>
				<option>Lucknow</option>
				<option>Nanital</option>
				<option>Mumbai</option>
				<option>Banglore</option>
				
				</select>
				
				
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td>
				<input type="submit" name="t7" value="submit">
				</td>
			</tr>
		

</table>




</form>
</div> 
</body>
</html>