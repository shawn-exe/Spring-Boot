package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.model.College;
import com.infosys.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	private CollegeService clgService;
	

	
	// Inserting Employees
	@PostMapping
	public ResponseEntity<College> saveCollege(@RequestBody College college)
	{
		return new ResponseEntity<College>(clgService.saveCollege(college),HttpStatus.CREATED);
		
	}
	
	//get all employees
	@GetMapping
	public List<College> getAllColleges()
	{
		return clgService.getAllColleges();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<College> getCollegeById(@PathVariable("id")Long id)
	{
		return new ResponseEntity<College>(clgService.getCollegeById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<College> updateStudent(@PathVariable("id")Long id , @RequestBody College college)
	{
		return new ResponseEntity<College>(clgService.updateCollege(college,id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id")Long id )
	{
		clgService.deleteCollege(id);
		return new ResponseEntity<String>("College Delete Successfully",HttpStatus.OK);
	}
}
