package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.model.Company;
import com.infosys.model.Employee;

@RestController
@RequestMapping("/companies")
public class CompanyController {	
	

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/{cid}")
	public Company getCompany(@PathVariable("cid") int cid)
	{
		Company c =new Company(101,"Infosys");		
		 Employee posts = restTemplate.getForObject("http://localhost:8091/employees/1", Employee.class);
	        c.setEmployee(posts);
		return c;
	}

}
