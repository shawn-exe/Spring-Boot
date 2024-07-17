package com.infosys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.exception.ResourceNotFoundException;
import com.infosys.model.Employee;
import com.infosys.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Employee savEmployee(Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee =  employeeRepo.findById(id);
		if (employee.isPresent())
		{
			return employee.get();			
		}
		else
		{ 
			throw new ResourceNotFoundException("Employee", "Id", id);
		}
		
		//Lamda expression:
//		return employeeRepo.findById(id).orElseThrow(()->
//		new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, Long id) {

		Employee existemp=employeeRepo.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee", "Id", id));
		existemp.setFirstname(employee.getFirstname());
		existemp.setLastname(employee.getLastname());
		existemp.setEmail(employee.getEmail());
		employeeRepo.save(existemp);
		return existemp;
	}

	@Override
	public void deleteEmp(Long id) {
employeeRepo.deleteById(id);		
	}

}
