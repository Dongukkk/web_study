package com.app.controller.study.practice.practice11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice11Controller {

	
	@GetMapping("/practice11/first")
	public String first(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		request.setAttribute("accessUrl", "/first");
		

		if(session.getAttribute("accessUrl") != null) {
			request.setAttribute("accessUrl", session.getAttribute("accessUrl"));
			
			//session.removeAttribute("accessUrl"); // 특정 키값으로 삭제
			session.invalidate(); //세션 클리어
		}
		
		return "practice/practice11/targetPage";
	}
	
	@GetMapping("/practice11/firsthide1")
	public String firstHide1(HttpServletRequest request) {

		request.setAttribute("accessUrl", "/firsthide1");
		
		return "practice/practice11/targetPage";
	}
	
	
	@GetMapping("/practice11/firsthide2")
	public String firstHide2(HttpServletRequest request) {
		
		//request.setAttribute("accessUrl", "/first");
		
		return "redirect:/practice11/first";
	}
	
	@GetMapping("/practice11/firsthide3")
	public String firstHide3(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("accessUrl", "/firsthide3");
		//request.setAttribute("accessUrl", "/first");
		
		//firsthide3 에 접근했었다 라는 의미를 -> 전달 -> session 영역에 저장
		
		return "redirect:/practice11/first";
	}
}
