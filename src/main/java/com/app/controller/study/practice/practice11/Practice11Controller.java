package com.app.controller.study.practice.practice11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice11Controller {

	@GetMapping("/practice11/first")
	public String first(HttpServletRequest request) {
		
		request.setAttribute("accessUrl", "/first");
		
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
}
