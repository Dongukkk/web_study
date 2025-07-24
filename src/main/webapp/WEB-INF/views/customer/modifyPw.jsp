<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>비밀번호 변경</h1>

	<form action="/customer/modifyPw" method="post">
		<label>변경할 비밀번호<input type="password" name="pw"></label><br>
		<input type="hidden" name="id" value="${user.id}"><br>
		<input type="hidden" name="name" value="${user.name}"><br>
		<input type="hidden" name="userType" value="${user.userType}"><br>
		<button type="submit">비밀번호 변경하기</button>
	</form>
	
	<button onClick="location.href='/customer/mypage'">마이페이지로 돌아가기</button>
</body>
</html>