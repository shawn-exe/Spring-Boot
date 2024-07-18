package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Profiles;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	@GetMapping(value="/{profileId}")
	public Profiles getProfiles (@PathVariable("profileId") int profileId)
	{
		Profiles profile1 =new Profiles(20,"This is my new Profile!");
		return profile1;
	}
}
