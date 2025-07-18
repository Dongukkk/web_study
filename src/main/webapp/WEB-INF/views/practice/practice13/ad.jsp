<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.ad-display-hide {
		display:none;
	}
</style>
</head>
<body>

	<h1>Practice13 광고 숨기기</h1>
	
	<c:if test="${close == null}">
		<form action="" method="post" id="adForm">
		
			<p> "광고 내용" </p>
			<input type="checkbox" name ="hideAd" id="chk_hide">24시간 보지 않기 <br>
			<button type="submit">닫기</button>
			
		</form>
	</c:if>
	<p>뒤의 내용 ...</p>
	
	<script>
		
		const adForm = document.getElementById("adForm");
		const chkHide = document.getElementById("chk_hide");
		
		adForm.addEventListener("submit", (e)=>{
			e.preventDefault();
			
			//checkbox 체크 O -> form 요청 -> 서버 Post
			//checkbox 체크 X -> 일시적으로 안보이게 -> display:none;
			
			if(chkHide.checked) {	//check O
				adForm.submit();
			} else {	//check X
				/* adForm.style.display = 'none'; */
				adForm.classList.add('ad-display-hide');
			}
		});
	
	</script>
</body>
</html>