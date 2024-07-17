package com.infosys.springcore.library;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.springcore.library.Dao.BooksDao;
import com.infosys.springcore.library.entity.Books;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new AnnotationConfigApplicationContext(jdbcConfig.class);
    	BooksDao booksDao=context.getBean("BooksDao",BooksDao.class);
    	
    	//Inserting the data to the database

		 Books books = new Books();
//		 books.setBid(5); 
//		 books.setBname("GOT");
//		 books.setAname("RR MARTIN");
//		 books.setYr("2011");
//		 int result= booksDao.insert(books);
//		 System.out.println("No. of rows inserted: "+result);
//    	
    	
		//to update the existing values
//    	books.setAname("Messi");
//    	books.setBid(1);
//    	int ans1 =booksDao.modify(books);
//    	System.out.println("No. of rows Updated: "+ans1);
    	
		//Delete operation:
//	    int ans2=booksDao.delete(1);
//	    System.out.println("deleted "+ans2);
		 
		//Retrive Operation:
//	    	Books b=booksDao.getBook(2);
//	    	System.out.println(b);
		 
		 //All books
		 List<Books> bks=booksDao.getAllBooks();
    	for(Books b : bks)
	    	{
	    		System.out.println(b);
	    	}
    }
}
