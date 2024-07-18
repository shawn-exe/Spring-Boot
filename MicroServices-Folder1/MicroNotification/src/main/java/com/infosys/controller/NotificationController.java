package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Notifications;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
	@GetMapping(value="/{nId}")
	public Notifications getPosts(@PathVariable("nId") int nId)
	{
		Notifications n1 = new Notifications(100,"First Notification");
		return n1;
	}
}
