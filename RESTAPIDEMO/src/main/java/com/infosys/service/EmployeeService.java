package com.infosys.service;

import java.util.List;

import com.infosys.model.Employee;

public interface EmployeeService {

	Employee savEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee, Long id);
	
	void deleteEmp(Long id);
}
