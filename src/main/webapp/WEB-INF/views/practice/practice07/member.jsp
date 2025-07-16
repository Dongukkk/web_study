<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="member" items="${memberList}">
		<p>${member.id} ${member.pw} ${member.name}</p>
	</c:forEach>
</body>
</html>