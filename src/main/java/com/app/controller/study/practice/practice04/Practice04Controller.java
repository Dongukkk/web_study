package com.app.controller.study.practice.practice04;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.practice.practice04.Product;
import com.app.dto.study.practice.practice04.TransferItem;

@Controller
@RequestMapping("/practice04")
public class Practice04Controller {

	@RequestMapping("/request1-1")
	public String req1(HttpServletRequest request) {
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("product"));
		return "practice/practice04/request";
	}
	
	@RequestMapping("/request1-2")
	public String req2(@RequestParam(required = false) String category, 
						@RequestParam(required = false) String product) {
		System.out.println(category);
		System.out.println(product);
		return "practice/practice04/request";
	}
	
	@RequestMapping("/request1-3")
	public String req4(@ModelAttribute Product product) {

		System.out.println(product.getCategory());
		System.out.println(product.getProduct());
		return "practice/practice04/request";
	}
	
	@RequestMapping("/request1-4")
	public String req3(@RequestParam Map<String, String> paramMap) {
		System.out.println(paramMap.get("category"));
		System.out.println(paramMap.get("product"));
		return "practice/practice04/request";
	}
	
	@RequestMapping("/viewData1-1")
	public String viewData1(HttpServletRequest request) {
		request.setAttribute("response001", "Success");
		request.setAttribute("response099", "Fail");
		return "practice/practice04/viewData";
	}
	
	@RequestMapping("/viewData1-2")
	public String viewData2(Model model) {
		model.addAttribute("response001", "Success");
		model.addAttribute("response099", "Fail");
		return "practice/practice04/viewData";
	}
	
	@RequestMapping("/viewData1-3")
	public ModelAndView viewData3(ModelAndView mav) {
		mav.setViewName("practice/practice04/viewData");
		mav.addObject("response001", "Success");
		mav.addObject("response099", "Fail");
		return mav;
	}
	
	@RequestMapping("/viewData1-4")
	public String viewData4(@ModelAttribute TransferItem transferItem,Model model ) {

		model.addAttribute("transferItem", transferItem);
		return "practice/practice04/viewData";
	}
}



















