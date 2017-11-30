package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void insertEmployee() {
		employeeService.insertEmployee();
		
	}
	@Test
	public void selectEmployee() {
		employeeService.selectEmployee();
	}
	@Test
	public void updateEmployee() {
		employeeService.updateEmployee();
	}
	@Test
	public void deleteEmployee() {
		employeeService.deleteEmployee();
	}
}
