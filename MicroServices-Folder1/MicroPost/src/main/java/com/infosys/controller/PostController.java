package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Posts;

@RestController
@RequestMapping("/posts")
public class PostController {

	@GetMapping(value="/{postId}")
	public Posts getPosts(@PathVariable("postId") int postId)
	{
		Posts post1 = new Posts(10,"First Post");
		return post1;
	}
}
