package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@GetMapping(value="/{eid}")
	public Employee getEmployee(@PathVariable("eid") int eid)
	{
	
	Employee e1 = new Employee(1,"Shawn Salis");
		return e1;
	}
}
