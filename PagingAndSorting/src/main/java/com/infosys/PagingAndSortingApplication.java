package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.entity.Employee;
import com.infosys.repository.EmpRepo;
import com.infosys.service.EmpServiceImpl;

@SpringBootApplication
public class PagingAndSortingApplication implements CommandLineRunner{

	@Autowired
	EmpServiceImpl empService;
	
	@Autowired
	EmpRepo empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PagingAndSortingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		int k = (int) (empRepo.count()/5);
//		for(int i=0;i<k;i++)
//		{
//
//		Pageable pageable = PageRequest.of(i, 5);
//		System.out.println("--------------------------------------------------------------");
//		System.out.println("Records of this page are: ");
//		System.out.println("--------------------------------------------------------------");
//		Iterable<Employee> emp1= empService.findAll(pageable);
//				
//				for(Employee e : emp1)
//				{
//					System.out.println(e);
//				}
//	}
		
		int k = (int) (empRepo.count()/5);
		for(int i=0;i<k;i++)
		{		
		Pageable pageable = PageRequest.of(i, 5,Sort.by(Sort.Direction.ASC,"empName"));
		
    	System.out.println("--------------------------------------------------------------");

		System.out.println("Sorted pages are");
    	System.out.println("--------------------------------------------------------------");

		Iterable<Employee> emp2=empService.findAll(pageable);
		for(Employee em:emp2) {
			System.out.println(em);
		}
	}
	}
}
