package com.infosys;

import java.awt.print.Pageable;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.infosys.entities.User;
import com.infosys.repositories.UserRepo;

@SpringBootApplication
public class SbjpademoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SbjpademoApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		
//		//Inserting the data into the DB--Single data
//		User user1 = new User();
//		user1.setName("Kris");
//		user1.setCity("Udupi");
//		user1.setStatus("HR");
//		userRepo.save(user1);
		
		//Saving Mutliple data at a time
		//user1
//		User user = new User();
//		user.setName("Ronaldo");
//		user.setCity("Saudi");
//		user.setStatus("Forward");	
//		//user2
//		User user1 = new User();
//		user1.setName("Messi");
//		user1.setCity("Miami");
//		user1.setStatus("Forward");	
//		
//		List<User> users=List.of(user,user1);
//		Iterable<User>result= userRepo.saveAll(users);
//		
//		result.forEach(u->{
//			System.out.println(u.getId()+" "+u.getName()+" "+u.getCity()+" "+u.getStatus()+" ");
//		});
		
		//updating the value by id
//		Optional<User> optional= userRepo.findById(102);
//		User user = optional.get();
//		user.setName("Neymar jr");
//		user.setCity("Rio");
//		User res=userRepo.save(user);
//		System.out.println(res.getId()+" "+res.getName()+" "+res.getCity()+" "+res.getStatus()+" ");
//		
		
		// Retrieving data from DB
//		Optional<User> optional= userRepo.findById(102);
//		User user = optional.get();
//		System.out.println(user.getId()+" "+user.getName()+" "+user.getCity()+" "+user.getStatus()+" ");
		
		// Retrieving all rows from DB
//		Iterable<User>result=userRepo.findAll();
//		result.forEach(u->{
//		System.out.println(u.getId()+" "+u.getName()+" "+u.getCity()+" "+u.getStatus()+" ");
//		});
		//method 2:
		//Iterable<User>result=userRepo.findAll();
//		Iterator<User>iterator=result.iterator();
//		while(iterator.hasNext())
//		{
//			User u=iterator.next();
//			System.out.println(u.getId()+" "+u.getName()+" "+u.getCity()+" "+u.getStatus()+" ");
//		}
		
		//Delete a Single data from the DB
//		userRepo.deleteById(2);
//		System.out.println("Deleted the user successfully");
		
		//Delete all entries form the table
//		Iterable<User> itr = userRepo.findAll();
//		//the below for loop is just for readability
//		itr.forEach(u->
//		{
//			System.out.println("User Deleted: "+u.getId()+" "+u.getName()+" "+u.getCity()+" "+u.getStatus()+" ");
//		});
//		userRepo.deleteAll(itr);
		
		//Custom function findByName
//		List<User> users=userRepo.findByName("shawn");
//		users.forEach(i->{
//			System.out.println(i.getName()+" "+i.getCity());
//		});
		
		//class-3
//		List<User> all_users=userRepo.getUserByStatus("HR","Udupi");//check the function @query in userRepo
//		all_users.forEach(i->{
//			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity()+" "+i.getStatus());
//		});
		
		//Native Query
//		List<User> all_users=userRepo.getUserByNameandStatusNative("Ramesh","SalesMan");//check the function @query in userRepo
//		all_users.forEach(i->{
//			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity()+" "+i.getStatus());
//		});
	
	}

}
