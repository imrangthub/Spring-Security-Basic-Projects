package com.imran.service;

import java.util.List;

import com.imran.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public List<Employee> listEmployee();
	
	public Employee getEmployeeById(Integer employeeId);
	
	public void removeEmployee(Integer employeeId);

}
