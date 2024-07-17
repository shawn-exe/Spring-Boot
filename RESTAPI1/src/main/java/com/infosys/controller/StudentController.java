package com.infosys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	//@GetMapping(path="/student")
	public Student getStudent()
	{
		return new Student(1,"Shawn Salis");
	}
	
	//List of Students passed to client
	@GetMapping(path="/students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Shawn Salis"));
		students.add(new Student(2,"Jnanesh"));
		students.add(new Student(3,"Nishanth"));
		students.add(new Student(4,"Karan"));
		students.add(new Student(5,"Navaraj"));
		students.add(new Student(6,"Shashank"));
		return students;
	}
	
	// By using pathVariable
		@GetMapping("{id}/{name}")
		public Student studentPathVariable(@PathVariable("id") Integer id, @PathVariable("name") String name) 
		{
			return new Student(id, name);
		}
		
	//using Query parameters
	@GetMapping("/student/query")
	public Student studetQuery(@RequestParam( name= "id")int id,@RequestParam( name= "name")String name) {
		return new Student(id,name);
	}
		
	
	
}
