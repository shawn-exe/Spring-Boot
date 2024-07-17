package com.infosys.springcore.library.Dao;

import java.util.List;

import com.infosys.springcore.library.entity.Books;

public interface BooksDao {
	public int insert(Books books);
	public int modify(Books books);
	public int delete(int bid);
	
	public Books getBook(int usn);
	public List<Books> getAllBooks();
	
}
