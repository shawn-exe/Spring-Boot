package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Contacts;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	@GetMapping(value="/{phno}")
	public Contacts getPosts(@PathVariable("phno") int phno)
	{
		Contacts c1 = new Contacts(98989898,"Shawn Salis");
		return c1;
	}
}
