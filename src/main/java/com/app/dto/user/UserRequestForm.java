package com.app.dto.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRequestForm { 
	//특정 화면에서 요청 들어온 데이터를 담아야하는 용도 DTO

	//필수입력 빈칸X
	@NotBlank(message = "이거 아이디 필순데?")
	String id;
	
	//입력 길이 제한
	String pw;
	
	@NotBlank(message = "이거 이름 필순데?")
	String name;
	String userType;
}

// UserRequestForm 담긴 -> User 객체에 옮겨담아서 -> userService.saveUser