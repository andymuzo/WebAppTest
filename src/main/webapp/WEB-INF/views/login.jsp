<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generic Title</title>
</head>
<body>
	<p>
		<font color="red">${warning}</font>
	</p>
	<form action="/spring-mvc/login" method="post">
		Enter your name <input type="text" name="name" /> Enter your password
		<input type="password" name="password" /> <input type="submit" />
	</form>
</body>
</html>