package com.infosys;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.entities.Address;
import com.infosys.entities.Category;
import com.infosys.entities.Laptop;
import com.infosys.entities.Product;
import com.infosys.entities.Student;
import com.infosys.repository.CategoryRepo;
import com.infosys.repository.ProductRepo;
import com.infosys.repository.laptopRepo;
import com.infosys.repository.studentRepo;

@SpringBootApplication
public class MappingDemoApplication implements CommandLineRunner{

	@Autowired
	private studentRepo stRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	private org.slf4j.Logger logger= LoggerFactory.getLogger(MappingDemoApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		Product p1=new Product();
//		p1.setProd_id(1);
//		p1.setProd_name("Redmi");
//		
//		Product p2=new Product();
//		p2.setProd_id(2);
//		p2.setProd_name("Hp");
//		
//		Product p3=new Product();
//		p3.setProd_id(3);
//		p3.setProd_name("Lenovo");
//		
//		
//		Category c1=new Category();
//		c1.setCat_id(1);
//		c1.setTitle("Electronics");
//		
//		Category c2=new Category();
//		c2.setCat_id(2);
//		c2.setTitle("Mobiles");
//		
//		Category c3=new Category();
//		c3.setCat_id(3);
//		c3.setTitle("HomeMade");
//		
//		List<Product> cat1prods = c1.getProducts();
//		cat1prods.add(p1);
//		cat1prods.add(p2);
//		cat1prods.add(p3);
//		
//		
//		List<Product> cat2prods = c2.getProducts();
//		cat2prods.add(p1);
//		cat2prods.add(p3);
//		
//		List<Product> cat3prods = c3.getProducts();
//		cat3prods.add(p2);
//		cat3prods.add(p1);
//		
//		categoryRepo.save(c1);
//		categoryRepo.save(c2);
//		categoryRepo.save(c3);
//		
		Category c=categoryRepo.findById(2).get();
		List<Product> products=(c.getProducts());
		for (Product p : products)
		{
			System.out.println("productid: " + p.getProd_id() + ", ProductName: " + p.getProd_name());
		}
		
		
//		Student student = new Student();		
//		student.setStId(1);
//		student.setStName("Shawn Salis");
//		student.setStBranch("CSE");
//		
//		Laptop laptop = new Laptop();
//		laptop.setLaptop_Id(11);
//		laptop.setLaptop_Name("Dell Inspiron");
//		laptop.setLaptop_Config("Productivity");
//		laptop.setStudent(student);
//		
//		student.setLaptop(laptop);
//		
//		Address a1 = new Address();
//		a1.setAddress_id(1);
//		a1.setCity("Nitte");
//		a1.setStreet("Snamathi");
//		a1.setCountry("India");
//		a1.setStudent(student);
//		
//		Address a2 = new Address();
//		a2.setAddress_id(2);
//		a2.setCity("Manglaore");
//		a2.setStreet("Pumpwell");
//		a2.setCountry("India");
//		a2.setStudent(student);
//		
//
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//		
//		student.setAddress(addressList);
//		
//		stRepo.save(student);
//		logger.info("Student Saved Succesfully:{}",student.getStName());

		
	}

}
