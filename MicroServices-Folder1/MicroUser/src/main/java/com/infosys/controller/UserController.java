package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.model.Contacts;
import com.infosys.model.Notifications;
import com.infosys.model.Posts;
import com.infosys.model.Profiles;
import com.infosys.model.Users;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/{userId}")
	public Users getUsers(@PathVariable("userId") int userId)
	{
		Users user1 = new Users(1,"Shawn",987898792);
	
		  Posts posts = restTemplate.getForObject("http://localhost:8081/posts/10", Posts.class);
	        user1.setPosts(posts);

	      Notifications notifications = restTemplate.getForObject("http://localhost:8082/notifications/100", Notifications.class);
	        user1.setNotifications(notifications);
		
//	      Profiles profiles = restTemplate.getForObject("http://MICROPROFILE/profiles/20", Profiles.class );
//	       user1.setProfiles(profiles);
//	       
//	       Contacts contacts = restTemplate.getForObject("http://MICROCONTACTS/contacts/98989898", Contacts.class );
//	       user1.setContacts(contacts);
//		
		return user1;
	}
}