package com.infosys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

//	@GetMapping("/")
//	public String homeController() {	
//		return "home";
//	}
	
	@GetMapping("/")
	public String homePage(Model model) {	
		model.addAttribute("firstName", "Shawn");
		model.addAttribute("lastName", "Salis");
		return "home";
	}
	
	@GetMapping("add")
	public String add(HttpServletRequest req) {	
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		int res = i+j;
		HttpSession session = req.getSession();
		session.setAttribute("res", res);
		return "res.jsp?res="+res;
	}
	
	
	
	
}
