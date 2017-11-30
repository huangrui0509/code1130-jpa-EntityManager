package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
@Transactional
public class EmployeeService {
//容器管理
	@PersistenceContext
	EntityManager entityManager;
	
	public void insertEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("emp2");
		emp.setSalary(10000);
		entityManager.persist(emp);
		
	}
	
	public void selectEmployee() {
		
		Employee emp = entityManager.find(Employee.class, new Long(100));
		System.out.println(emp);
	}
	
	public void updateEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("emp3");
		emp.setSalary(20000);
		
		entityManager.merge(emp);
	}
	public void deleteEmployee() {
		Employee emp = entityManager.find(Employee.class, new Long(100));
		
		entityManager.remove(emp);
	}
	
	
}
