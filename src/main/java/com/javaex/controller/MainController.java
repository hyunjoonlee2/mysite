package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	//필드
	//생성자
	//메서드 getter, setter
	// 일반
	@RequestMapping(value="/main", method = {RequestMethod.GET, RequestMethod.POST})
	public String main() {
		
		System.out.println("MainController.main()");
		return "/WEB-INF/views/main/main.jsp";
	}

}
