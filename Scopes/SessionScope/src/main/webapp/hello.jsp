<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Directive is the above which will give us the declarations
    	The above is enough to get the or load the data 
     -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>This is a java server page</h1>
		<h1>
			<% String name = "sai shiva";
			out.println(name);
			%>
		</h1>
		
		<h1>Hi <%= name %> you are good man </h1>
		<!-- Im loading the values dynamically where i used the expressions ... -->
		
		
</body>
</html>