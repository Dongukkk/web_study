package com.app.controller.study.practice.practice12;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Practice12Controller {

	int cnt=0;
	@GetMapping("/practice12/login")
	public String login() {
	
		return "practice/practice12/login";
	}
	
	@PostMapping("/practice12/login")
	public String loginAction(HttpServletRequest request) {
		
		//로그인 성공으로 간주하고, 로그인 사용자 id를 세션에 저장
		//					-> 나중에 다른 request에서도 session에 접근 및 데이터 조회 가능
		HttpSession session = request.getSession();
		session.setAttribute("id", request.getParameter("id"));
		session.setAttribute("count", 0);
		
//		return "practice/practice12/count";
		return "redirect:/practice12/count";
	}
	
	
	
	@GetMapping("/practice12/count")
	public String count(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		
		//로그인한 사용자가 있으면-> count 값도 초기화되서 있다
		if(session.getAttribute("id")!=null) {
			session.setAttribute("count", Integer.parseInt(session.getAttribute("count").toString())+1);
		} else {
			model.addAttribute("count", 0);
		}
//		cnt++;	
//		session.setAttribute("count", cnt);

		request.setAttribute("id", session.getAttribute("id"));
		


		return "practice/practice12/count";	//url mapping 경로
	}
	
	@GetMapping("/practice12/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
//		cnt=0;
		session.removeAttribute("count");
		session.invalidate();
		
		return "redirect:/practice12/login";
	}
}
