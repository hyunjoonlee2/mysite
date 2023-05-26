package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	//필드
	//생성자
	//메소드 getter setter
	//일반 메서드
	
	@RequestMapping(value="/hello", method = {RequestMethod.GET, RequestMethod.POST})
	public String hello() {
		System.out.println("HelloController.hello()");
		
		return"/WEB-INF/views/hello.jsp";
	}

}
