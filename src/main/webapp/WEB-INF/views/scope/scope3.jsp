<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope3</h1>
	<p>${requestMsg}</p>
	<p>${requestScope.requestMsg}</p>
	
	<p>${sessionMsg}</p>
	<p>${sessionScope.sessionMsg}</p>
	
	<p>${applicationMsg}</p>
	<p>${applicationScope.applicationMsg}</p>
</body>
</html>