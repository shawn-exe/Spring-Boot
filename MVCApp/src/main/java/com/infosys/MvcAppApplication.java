package com.infosys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.entities.Employee;
import com.infosys.repository.EmployeeRepository;

@SpringBootApplication
public class MvcAppApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MvcAppApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Employee e2 = new Employee("Jnanesh","CSE","jshenoy@gmail.com");
//		empRepo.save(e2);
	}

}
