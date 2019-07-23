<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User manager</title>
</head>
<body >
	<div align="center">
	<h1>Login Page</h1>
		<form action="login" method="get">
		<table  border="0" >
			<tr bgcolor="transparent">
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr bgcolor="transparent">
			<tr>
				<td>Password:</td>
				<td><input type="text" name="pass"></td>
			</tr>
			<tr><td><input type="submit" value="Login" name="login"></td></tr>
		</table>
		</form>
		<h3><a href="new">New registration</a></h3>
	</div>
</body>
</html>