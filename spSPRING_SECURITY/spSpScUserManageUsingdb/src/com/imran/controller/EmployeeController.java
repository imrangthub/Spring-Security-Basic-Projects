package com.imran.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.imran.model.Employee;
import com.imran.service.EmployeeService;


@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	//Routing
	
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
		map.addAttribute("title", "Admin | Dashboard");
		
		List<Employee> results = new ArrayList<Employee>();
		results= employeeService.listEmployee();
		map.addAttribute("employees", results);
		
		return "admin/dashboard";
	}
	
	// EMPLOYEE CRUD
	
	@RequestMapping("/create")
	public String create(){
		return "admin/create";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addAndUpdate(ModelMap map, @ModelAttribute("employee") Employee employee, BindingResult result){
		
		if(employee.getUsername() == null || employee.getUsername() == "" || employee.getPassword() == null || employee.getPassword()==""){
			map.addAttribute("errorMsg", "Require field is empty");
			return "admin/create";
		}
		if(employee.getId()==null){
			employee.setActiveStatus(1);
			employeeService.addEmployee(employee);
			map.addAttribute("successMsg", "Successfully add Your Employee");
		}else{
			employee.setActiveStatus(1);
			map.addAttribute("successMsg", "Successfully Update Your Employee");
			employeeService.updateEmployee(employee);
		}
		return "redirect:/emp/admin";
	}
	
	@RequestMapping(value="/edit/{id}")
	public String editEmployee(@PathVariable("id") Integer id, Map<String, Object> map){
		Employee employee = employeeService.getEmployeeById(id);
		map.put("employee", employee);
		return "admin/create";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id){
		employeeService.removeEmployee(id);
		System.out.println(id);
		return "redirect:/emp/admin";
	}
	
	
	
	

}
