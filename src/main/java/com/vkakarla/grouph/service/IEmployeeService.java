package com.vkakarla.grouph.service;

import java.util.List;

import com.vkakarla.grouph.entities.Employee;
import com.vkakarla.grouph.exception.RecordNotFoundException;

public interface IEmployeeService {
	
	 public Employee createEmployee(Employee entity);
	 
	 public Employee getEmployeeById(Long id) throws RecordNotFoundException;
	 
	 public List<Employee> getAllEmployee();
	 
	 public Employee updateEmployee(Employee entity); 
	 
	 public void deleteEmployeeById(Long id) throws RecordNotFoundException;
	 

}
