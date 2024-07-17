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
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	

		@PostMapping
		public ResponseEntity<Student> saveEmployee(@RequestBody Student student)
		{
			return new ResponseEntity<Student>(studentService.savEmployee(student),HttpStatus.CREATED);
			
		}
		
		@GetMapping
		public List<Student> getAllEmps()
		{
			return studentService.getAllStudents();
		}
		
		@GetMapping("{id}")
		public ResponseEntity<Student> getEmployeeById(@PathVariable("id")Long id)
		{
			return new ResponseEntity<Student>(studentService.getStudentById(id),HttpStatus.OK);
			
		}
		
		@PutMapping("{id}")
		public ResponseEntity<Student> updateEmployee(@PathVariable("id")Long id , @RequestBody Student student)
		{
			return new ResponseEntity<Student>(studentService.updateStudent(student,id),HttpStatus.OK);
			
		}
		
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteEmployee(@PathVariable("id")Long id )
		{
			studentService.deleteStudent(id);
			return new ResponseEntity<String>("Student Deleted Successfully!!",HttpStatus.OK);
		}
		

		
}
