package com.vkakarla.grouph.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkakarla.grouph.entities.Employee;
import com.vkakarla.grouph.exception.RecordNotFoundException;
import com.vkakarla.grouph.repository.EmployeeRepository;
import com.vkakarla.grouph.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public Employee getEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = repository.findById(id);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> employeeList = repository.findAll();

		if (employeeList.size() > 0) {
			return employeeList;
		} else {
			return new ArrayList<Employee>();
		}
	}

	@Override
	public Employee createEmployee(Employee entity) {
		repository.save(entity);
		Optional<Employee> employee = repository.findById(entity.getId());
		return employee.get();
	}

	@Override
	public Employee updateEmployee(Employee entity) {
		repository.save(entity);

		Optional<Employee> employee = repository.findById(entity.getId());
		return employee.get();
	}

	@Override
	public void deleteEmployeeById(Long id) throws RecordNotFoundException {

		Optional<Employee> employee = repository.findById(id);

		if (employee.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

}
