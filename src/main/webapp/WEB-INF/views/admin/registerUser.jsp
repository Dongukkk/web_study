<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>관리자 페이지</h1>
	<h2>사용자(User) 추가</h2>

	<!-- 일단 계정을 만들고 비밀번호는 고객에게 따로 입력 요청을 할 것이라는 시나리오를 가정하고,
	pw 를 제외한 값을 입력하여 저장(insert)하도록 만들어보세요.
	
	페이지 경로를 통해서 고객 정보를 DB에 Insert 처리해보기
	※화면에서는 id와 name을 입력받고, user_type은 기본값으로 "CUS"로 저장 -->
	<form action="" method="post">
		<label>아이디<input type="text" name="id"></label><br>
		<!-- <label>비밀번호<input type="password" name="pw"></label><br> -->
		<label>이름<input type="text" name="name"></label><br>

		<!-- <h4>유저타입</h4> -->
		<!-- <select name="userType">
			<option value="ADM">관리자</option>
			<option value="CUS">고객</option>
		</select> -->

		<br>
		<button type="submit">등록하기</button>
	</form>
</body>
</html>