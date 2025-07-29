<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서 정보 수정</h1>
	<h2>도서 제목 : ${book.title}</h2>
	
	<form action="/books/modify" method="post">
	
		<input type="hidden" name="id" value="${book.id}"><br>
		
		<label>제목<input type="text" name="title" value="${book.title}"></label><br>
		<label>저자<input type="text" name="author" value="${book.author}"></label><br>
		<label>가격<input type="text" name="price" value="${book.price}"></label><br>
		
		<br>
		<button type="submit">수정하기</button>
	</form>
	<div>
		<button type="button" onClick="location.href='/books'">도서 목록보기</button>
	</div>
</body>
</html>