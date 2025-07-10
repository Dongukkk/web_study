package com.app.controller.study.practice.practice03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.practice.practice03.DrinkItem;
import com.app.dto.study.practice.practice03.Beverage;

@Controller
@RequestMapping("/practice03")
public class Practice03Controller {

	@RequestMapping("/request1-1")
	public String req1(HttpServletRequest request) {
		System.out.println(request.getParameter("item"));
		System.out.println(request.getParameter("type"));
		return "practice/practice03/req";
	}
	
	@RequestMapping("/request1-2")
	public String req2(@RequestParam(required = false) String item, 
						@RequestParam(required = false) String type) {
		System.out.println(item);
		System.out.println(type);
		return "practice/practice03/req";
	}
	
	@RequestMapping("/request1-3")
	public String req3(@RequestParam Map<String, String> paramMap) {
		System.out.println(paramMap.get("item"));
		System.out.println(paramMap.get("type"));
		return "practice/practice03/req";
	}
	
	@RequestMapping("/request1-4")
	public String req4(@ModelAttribute Beverage beverage) {

		System.out.println(beverage);
		return "practice/practice03/req";
	}
	
	@RequestMapping("/viewData1-1")
	public String viewData1(HttpServletRequest request) {
		request.setAttribute("name", "abc");
		request.setAttribute("type", "alpha");
		return "practice/practice03/viewData1";
	}
	
	@RequestMapping("/viewData1-2")
	public String viewData2(Model model) {
		model.addAttribute("name", "abc");
		model.addAttribute("type", "alpha");
		return "practice/practice03/viewData1";
	}
	
	@RequestMapping("/viewData1-3")
	public ModelAndView viewData3(ModelAndView mav) {
		mav.setViewName("practice/practice03/viewData1");
		mav.addObject("name", "abc");
		mav.addObject("type", "alpha");
		return mav;
	}
	
	@RequestMapping("/viewData1-4")
	public String viewData4(Model model) {

		DrinkItem drinkItem = new DrinkItem();
		drinkItem.setName("abc");
		drinkItem.setType("type");
		model.addAttribute("drinkItem", drinkItem);
		return "practice/practice03/viewData4";
	}
}
