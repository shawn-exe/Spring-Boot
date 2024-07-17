package com.infosys;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.infosys.entities.Library;
import com.infosys.repositories.LibraryRepository;

@SpringBootApplication
public class LibraryJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(LibraryJpaApplication.class, args);
		LibraryRepository libRepo = context.getBean(LibraryRepository.class);
		
		//Inserting Books into the DB
//		Library book1 = new Library();
//		book1.setBname("Spring Concepts");
//		book1.setAname("John");
//		book1.setCategory("Technologies");
//		book1.setPrice(1250);
//		book1.setPublication("Java Publishers");
//		book1.setAvailable(true);
//		
//		Library book2 = new Library();
//		book2.setBname("Java Fundamentals");
//		book2.setAname("Jane Doe");
//		book2.setCategory("Technologies");
//		book2.setPrice(1500);
//		book2.setPublication("Tech Publishers");
//		book2.setAvailable(true);
//
//		Library book3 = new Library();
//		book3.setBname("Advanced Python");
//		book3.setAname("Alice Smith");
//		book3.setCategory("Technologies");
//		book3.setPrice(1300);
//		book3.setPublication("Programming Press");
//		book3.setAvailable(false);
//
//		Library book4 = new Library();
//		book4.setBname("Data Structures");
//		book4.setAname("Bob Johnson");
//		book4.setCategory("Technologies");
//		book4.setPrice(1400);
//		book4.setPublication("Code Masters");
//		book4.setAvailable(true);
//
//		Library book5 = new Library();
//		book5.setBname("Machine Learning Basics");
//		book5.setAname("Carol White");
//		book5.setCategory("Technologies");
//		book5.setPrice(1600);
//		book5.setPublication("AI Books");
//		book5.setAvailable(true);
//
//		List<Library> books=List.of(book1,book2,book3,book4,book5);
//		Iterable<Library>res= libRepo.saveAll(books);
//				res.forEach(book->{
//					System.out.println("Book ID: " + book.getBookid() + 
//			                   ", Book Name: " + book.getBname() + 
//			                   ", Author Name: " + book.getAname() + 
//			                   ", Category: " + book.getCategory() + 
//			                   ", Price: " + book.getPrice() + 
//			                   ", Publication: " + book.getPublication() + 
//			                   ", Available: " + book.isAvailable());
//		});
//		System.out.println("The Books are added to the Library..");
		
		//updating a Book by BookId
//		Optional<Library> optional= libRepo.findById(52);
//		Library book = optional.get();
//		book.setAname("Ashlin Salis");
//		book.setCategory("Web Technologies");
//		book.setPrice(2000);
//		book.setPublication("Web Publications");
//		Library res=libRepo.save(book);
//		System.out.println("Book ID: " + book.getBookid() + 
//                ", Book Name: " + book.getBname() + 
//                ", Author Name: " + book.getAname() + 
//                ", Category: " + book.getCategory() + 
//                ", Price: " + book.getPrice() + 
//               ", Publication: " + book.getPublication() + 
//                ", Available: " + book.isAvailable());
//		System.out.println("Book information Updated Successfully");			
//	}

		//Retrieve Books by Id:
//		System.out.println("-------------------------------------------------------------------------------------------------------------------");
//		Optional<Library> optional= libRepo.findById(54);
//		Library book=optional.get();
//		System.out.println("Book ID: " + book.getBookid() + 
//               ", Book Name: " + book.getBname() + 
//               ", Author Name: " + book.getAname() + 
//               ", Category: " + book.getCategory() + 
//                ", Price: " + book.getPrice() + 
//               ", Publication: " + book.getPublication() + 
//                ", Available: " + book.isAvailable());
//		System.out.println("-------------------------------------------------------------------------------------------------------------------");

		//Retrieve Books by BookName:
//		System.out.println("Retriving Book by Book-Name");
//		List<Library> books= libRepo.findByBname("Advanced Python");
//		books.forEach(book->{
//			System.out.println("Book ID: " + book.getBookid() + 
//		               ", Book Name: " + book.getBname() + 
//		               ", Author Name: " + book.getAname() + 
//		               ", Category: " + book.getCategory() + 
//		                ", Price: " + book.getPrice() + 
//		               ", Publication: " + book.getPublication() + 
//		                ", Available: " + book.isAvailable());
//		});
//		System.out.println("-------------------------------------------------------------------------------------------------------------------");
//		//Retrieve Books by AuthorName:
//				System.out.println("Retriving Book by Author-Name");
//				List<Library> books1= libRepo.findByAname("Carol White");
//				books1.forEach(book->{
//					System.out.println("Book ID: " + book.getBookid() + 
//				               ", Book Name: " + book.getBname() + 
//				               ", Author Name: " + book.getAname() + 
//				               ", Category: " + book.getCategory() + 
//				                ", Price: " + book.getPrice() + 
//				               ", Publication: " + book.getPublication() + 
//				                ", Available: " + book.isAvailable());
//				});
//				System.out.println("-------------------------------------------------------------------------------------------------------------------");
	
		//Retriving all the books
//		Iterable<Library>books=libRepo.findAll();
//		books.forEach(book->{
//			System.out.println("Book ID: " + book.getBookid() + 
//		               ", Book Name: " + book.getBname() + 
//		               ", Author Name: " + book.getAname() + 
//		               ", Category: " + book.getCategory() + 
//		                ", Price: " + book.getPrice() + 
//		               ", Publication: " + book.getPublication() + 
//		                ", Available: " + book.isAvailable());
//		});

		//Retriving based on availability
//	    System.out.println("--------------------------------------------------------------------------------------------------------");
//		System.out.println("Books that are available : ");
//		List<Library> books=libRepo.getBookByAvailability(true);
//		books.forEach(book->{
//			System.out.println("Book ID: " + book.getBookid() + 
//		               ", Book Name: " + book.getBname() + 
//		               ", Author Name: " + book.getAname() + 
//		               ", Category: " + book.getCategory() + 
//		                ", Price: " + book.getPrice() + 
//		               ", Publication: " + book.getPublication() + 
//		                ", Available: " + book.isAvailable());
//		});
//	    System.out.println("--------------------------------------------------------------------------------------------------------");
//		System.out.println("Books that are Not Available : ");
//		List<Library> books1=libRepo.getBookByAvailability(false);
//		books1.forEach(book->{
//			System.out.println("Book ID: " + book.getBookid() + 
//		               ", Book Name: " + book.getBname() + 
//		               ", Author Name: " + book.getAname() + 
//		               ", Category: " + book.getCategory() + 
//		                ", Price: " + book.getPrice() + 
//		               ", Publication: " + book.getPublication() + 
//		                ", Available: " + book.isAvailable());
//		});
//	    System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//Deleting a single book:
//		libRepo.deleteById(52);
//		System.out.println("Deleted the book successfully");
//		
		//Deleting all the books:
//		Iterable<Library> books = libRepo.findAll();
//	    System.out.println("--------------------------------------------------------------------------------------------------------");
//		books.forEach(book->
//		{
//			System.out.println("Book ID: " + book.getBookid() + 
//		               ", Book Name: " + book.getBname() + 
//		               ", Author Name: " + book.getAname() + 
//		               ", Category: " + book.getCategory() + 
//		                ", Price: " + book.getPrice() + 
//		               ", Publication: " + book.getPublication() + 
//		                ", Available: " + book.isAvailable());
//     	});
//		libRepo.deleteAll(books);	
//        System.out.println("--------------------------------------------------------------------------------------------------------");
//	
	}
}
