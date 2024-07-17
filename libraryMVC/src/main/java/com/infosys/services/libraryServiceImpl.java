package com.infosys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Library;
import com.infosys.repositories.libraryRepository;

@Service
public class libraryServiceImpl implements libraryService{

	@Autowired
	private libraryRepository libRepo;
	
	@Override
	public List<Library> getAllBooks() {
		
		return libRepo.findAll();
	}



	@Override
	public Library updatebook(Library lib) {
		// TODO Auto-generated method stub
		return libRepo.save(lib);
	}

	@Override
	public void deleteBook(int id) {
		libRepo.deleteById(id);
	}



	@Override
	public Library getBookById(int id) {
		// TODO Auto-generated method stub
		return libRepo.findById(id).get();
	}
	
	
}
