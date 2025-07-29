<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서 제목 : ${book.title}</h1>

	<p> 도서 ID : ${book.id}</p>
	<p> 도서 저자 : ${book.author}</p>
	<p> 도서 가격 : ${book.price}</p>
	
	<div>
		<button type="button" onClick="location.href='/books'">도서 목록보기</button>
	</div>
</body>
</html>