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
	<h1>도서 정보 목록</h1>
	
	<br>
	<button id="btn_registerBook">도서 추가하기</button>
	<br>
	<p>도서아이디	제목	저자	가격</p>
	<c:forEach var="book" items="${bookList}">
	
		<p>
			<a href="/books/info/${book.id}">
			${book.id}		${book.title}		 ${book.author}		${book.price}
			</a>
			<button type="button" onClick="removeBook(${book.id})">삭제하기</button>
			<button type="button" onClick="modifyBook(${book.id})">수정하기</button>
		</p>
		
	</c:forEach>
	
	<script>
		const btn_registerBook = document.getElementById('btn_registerBook');
		btn_registerBook.addEventListener('click', ()=>{
			location.href = "/books/register";
		})

		function removeBook(id){
			if(confirm("정말 삭제하시겠습니까?")){
				location.href='/books/remove?id='+id;
			}	
		}
		
		function modifyBook(id){
			location.href='/books/modify?id=' + id;
		}
		
	</script>
</body>
</html>