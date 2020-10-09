<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formulario</title>
</head>
<body>
	<h1>registrate</h1>
	<form action="./Servlet" method="post">
		<table>
			<tr>
				<td>NAME USER</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
</body>
</html>