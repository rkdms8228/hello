package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/test", method={RequestMethod.GET, RequestMethod.POST})
	 public String test() {
		
		 System.out.println("MainController > test");
		 
		 return "/WEB-INF/views/test.jsp";
		 
	 }
	
}
