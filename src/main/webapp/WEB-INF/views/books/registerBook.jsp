<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서 추가</h1>

	<form action="" method="post">
		<label>제목 <input type="text" name="title"></label><br>
		<label>저자 <input type="text" name="author"></label><br>
		<label>가격 <input type="text" name="price"></label><br>
		
		
		<br>
		<button type="submit">도서 추가</button>
	</form>
	<div>
		<button type="button" onClick="location.href='/books'">도서 목록보기</button>
	</div>
</body>
</html>