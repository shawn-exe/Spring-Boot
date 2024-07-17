package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Employee;
import com.infosys.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}


	@Override
	public Employee getEmployeeById(Long id) {
		return empRepo.findById(id).get();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
 		return empRepo.save(employee);
	}


	@Override
	public void deleteEmployeeById(Long id) {
		empRepo.deleteById(id);		
	}

}
