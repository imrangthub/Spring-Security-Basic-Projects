package com.imran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@RequestMapping(value="/")
	public String index(ModelMap map){
		map.addAttribute("title", "EMPLOYEE | HOME");
		
		map.addAttribute("msg", "This is a Employee Home");
		return "employee";
	}
	
	@RequestMapping(value="/user")
	public String user(ModelMap map){
		map.addAttribute("title", "Admin | Dashboard");
		
		map.addAttribute("msg", "This is a User Dashboard");
		return "user/dashboard";
	}
	
	@RequestMapping(value="/admin")
	public String admin(ModelMap map){
		map.addAttribute("title", "User | Dashboard");
		
		map.addAttribute("msg", "This is a Admin Dashboard");
		return "admin/dashboard";
	}

}
