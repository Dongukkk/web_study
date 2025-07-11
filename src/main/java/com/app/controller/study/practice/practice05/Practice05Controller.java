package com.app.controller.study.practice.practice05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice05")
public class Practice05Controller {
	
	@RequestMapping("/pathA")
	public String pathA(Model model) {
		model.addAttribute("itemClass","A");
		return "/practice/practice05/quiz";
	}
	
	@RequestMapping("/pathB")
	public String pathB(Model model) {
		model.addAttribute("itemClass","B");
		return "/practice/practice05/quiz";
	}
	
	@RequestMapping("/pathCommon/A")
	public String pathCommonA(Model model) {
		model.addAttribute("itemClass","A");
		return "/practice/practice05/quiz";
	}
	
	@RequestMapping("/pathCommon/B")
	public String pathCommonB(Model model) {
		model.addAttribute("itemClass","B");
		return "/practice/practice05/quiz";
	}
	
	/*
	@RequestMapping("/pathCommon/{itemClass}")
	public String pathCommon(@PathVariable String itemClass, Model model) {
	
		//경로에 있는 값 itemClass -> DB 조회
		//올바른 값인지 검증
		//그 정보에 맞는 데이터 획득 후 -> 화면 전달
		model.addAttribute("itemClass",itemClass);
		return "/practice/practice05/quiz";
	}
	*/
//	@RequestMapping("/pathA")
//	public String pathA() {
//		
//		return "/practice/practice05/quizA";
//	}
//	
//	@RequestMapping("/pathB")
//	public String pathB() {
//		
//		return "/practice/practice05/quizB";
//	}
//	
//	@RequestMapping("/pathCommon/A")
//	public String pathCommonA() {
//		
//		return "/practice/practice05/quizA";
//	}
//	
//	@RequestMapping("/pathCommon/B")
//	public String pathCommonB() {
//		
//		return "/practice/practice05/quizB";
//	}
}
