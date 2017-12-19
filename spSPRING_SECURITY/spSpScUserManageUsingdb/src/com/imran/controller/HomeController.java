package com.imran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String home(ModelMap map){
		map.addAttribute("title", "HOME");
		map.addAttribute("msg", "This is a Project Home Page form controller");
		System.out.println("Form Home Controller");
		return "index";
	}


}
