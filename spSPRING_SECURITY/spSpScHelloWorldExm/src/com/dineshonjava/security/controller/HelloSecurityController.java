package com.dineshonjava.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/hello")
public class HelloSecurityController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String executeSecurity(ModelMap model) {
 
		System.out.println("Form controller");
		
		model.addAttribute("title", "Test");
		model.addAttribute("msg", "Spring Security Hello World");
		return "hello";
 
	}
	

}
