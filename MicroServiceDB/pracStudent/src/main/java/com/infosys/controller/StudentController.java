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

import com.infosys.model.Student;
import com.infosys.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	private StudentService stuService;
	
	
	// Inserting Employees
		@PostMapping
		public ResponseEntity<Student> saveStudent(@RequestBody Student student)
		{
			return new ResponseEntity<Student>(stuService.savStudent(student),HttpStatus.CREATED);
			
		}
		
		//get all employees
		@GetMapping
		public List<Student> getAllStudent()
		{
			return stuService.getAllStudents();
		}
		
		@GetMapping("{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable("id")Long id)
		{
			return new ResponseEntity<Student>(stuService.getStudentById(id),HttpStatus.OK);
			
		}
		
		@PutMapping("{id}")
		public ResponseEntity<Student> updateStudent(@PathVariable("id")Long id , @RequestBody Student student)
		{
			return new ResponseEntity<Student>(stuService.updateStudent(student,id),HttpStatus.OK);
			
		}
		
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteStudent(@PathVariable("id")Long id )
		{
			stuService.deleteStudent(id);
			return new ResponseEntity<String>("Student Delete Successfully",HttpStatus.OK);
		}
		
}
