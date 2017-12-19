package com.imran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imran.dao.EmployeeDao;
import com.imran.model.Employee;


@Service
public  class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	public void addEmployee(Employee employee){
		employeeDao.addEmployee(employee);
	}
	
	public void updateEmployee(Employee employee){
		employeeDao.updateEmployee(employee);
	}
	
	public List<Employee> listEmployee(){
		return employeeDao.listEmployee();
	}
	
	public Employee getEmployeeById(Integer employeeId){
		return employeeDao.getEmployeeById(employeeId);
	}
	
	public void removeEmployee(Integer employeeId){
		employeeDao.removeEmployee(employeeId);
	}

	

}
