package com.imran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imran.model.Employee;


@Repository("employeeDao")
public class EmployeetDaoImpl implements EmployeeDao{
		
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
    public void addEmployee(Employee employee){
    	System.out.println("From DaoImpl"+employee);
    	sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }
	
	@Transactional
	public void updateEmployee(Employee employee){
		sessionFactory.getCurrentSession().update(employee);
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Employee> listEmployee(){
		return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Transactional
	public Employee getEmployeeById(Integer employeeId){
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}
	
	@Transactional
	public void removeEmployee(Integer employeeId){
		Employee product = (Employee)sessionFactory.getCurrentSession().load(Employee.class, employeeId);
		if(product != null){
			sessionFactory.getCurrentSession().delete(product);
		}
	}
	

}
