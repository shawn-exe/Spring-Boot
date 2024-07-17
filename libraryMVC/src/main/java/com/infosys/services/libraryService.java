package com.infosys.services;

import java.util.List;

import com.infosys.entities.Library;

public interface libraryService {

	List<Library> getAllBooks();
		
	Library getBookById(int id);
	
	Library updatebook(Library lib);
	
	void deleteBook(int id);  
}
