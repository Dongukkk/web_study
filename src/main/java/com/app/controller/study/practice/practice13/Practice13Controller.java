package com.app.controller.study.practice.practice13;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.util.MyCookieUtil;

@Controller
public class Practice13Controller {

	@GetMapping("/practice13/hideAd")
	public String hideAd(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String hideAd = MyCookieUtil.getCookie(request, "hideAd");
		
		if(hideAd != null) {
			request.setAttribute("hideAd", hideAd);
		};
		
		if(session.getAttribute("closeAd")!=null || MyCookieUtil.getCookie(request, "hideAd")!=null)
			request.setAttribute("close", "close");
		
		session.removeAttribute("closeAd");
		
		return "practice/practice13/ad";
	}
	
	@PostMapping("/practice13/hideAd")
	public String hideAdAction(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String hideAd = request.getParameter("hideAd");
		
		if( hideAd != null ) {	
			
			Cookie ck = MyCookieUtil.createCookie("hideAd", "hideAd", 60*60*24);
			response.addCookie(ck);
		}

		session.setAttribute("closeAd", "closeAd");
		
		return "redirect:/practice13/hideAd";
	
	}
}
