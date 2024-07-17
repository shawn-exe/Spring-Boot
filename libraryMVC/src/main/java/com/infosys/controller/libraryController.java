package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.infosys.entities.Library;
import com.infosys.repositories.libraryRepository;
import com.infosys.services.libraryService;

@Controller
public class libraryController {

	@Autowired
	private libraryRepository libRepo;
	
	@Autowired
	private libraryService libService;
	
	@GetMapping("/home")
	public String ListAllEmployees(Model model)
	{
		model.addAttribute("books",libService.getAllBooks());
		return "home";
	}
	
	@GetMapping("/newbook")
	public String AddNewEmployee(Model model)
	{
		Library lib = new Library();
		model.addAttribute("book",lib);
		return "addbooks";
	}
	
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Library lib)
	{
		libRepo.save(lib);
		return "redirect:/home";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editEmployeeForm( @PathVariable int id ,Model model)
	{
		model.addAttribute("book",libService.getBookById(id));
		return "editbook";
	}
	
	@PostMapping("/saveBook/{id}")
	public String updateEmployee(@PathVariable int id,@ModelAttribute("book") Library lib,Model model)
	{
		Library book = libService.getBookById(id);
		book.setBname(lib.getBname());
		book.setBauthor(lib.getBauthor());
		book.setAvail(lib.getAvail());
		libService.updatebook(book);
		return "redirect:/home";
	}
	
	@GetMapping("/deletebook/{id}")
	public String deleteEmployee( @PathVariable int id)
	{
		libService.deleteBook(id);
		return "redirect:/home";
	}
	
}
