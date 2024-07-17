package com.infosys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.exception.ResourceNotFoundException;
import com.infosys.model.Student;
import com.infosys.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository stuRepo;
	
	@Override
	public Student savEmployee(Student student) {
		stuRepo.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		return stuRepo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		Optional<Student> employee =  stuRepo.findById(id);
		if (employee.isPresent())
		{
			return employee.get();			
		}
		else
		{ 
			throw new ResourceNotFoundException("Student not found with id = " + id);		//
		}
	
	}

	@Override
	public Student updateStudent(Student student, Long id) {

		Student existStu=stuRepo.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Student not found with id = " + id));
		existStu.setName(student.getName());
		existStu.setUsn(student.getUsn());
		existStu.setEmail(student.getEmail());
		stuRepo.save(existStu);
		return existStu;
	}

	@Override
	public void deleteStudent(Long id) {
		stuRepo.deleteById(id);		
	}

}
