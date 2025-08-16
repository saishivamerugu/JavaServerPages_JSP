<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("emailId");
		String password = (String) request.getAttribute("password");
	%>
	
	<h1><%= name %> You have Signed Up</h1>
	<h2>Check Your password : <%= password %></h2>
	
</body>
</html>

<!-- It will give me the by defaault a object ... it is a parent class
	We has to type case explicitly
-->