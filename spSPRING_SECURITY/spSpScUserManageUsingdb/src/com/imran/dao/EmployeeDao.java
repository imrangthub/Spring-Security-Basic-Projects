package com.imran.dao;

import java.util.List;

import com.imran.model.Employee;

public interface EmployeeDao {
	
    public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public List<Employee> listEmployee();
	
	public Employee getEmployeeById(Integer employeeId);
	
	public void removeEmployee(Integer employeeId);

}
