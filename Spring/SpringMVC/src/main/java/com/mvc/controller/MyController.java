package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MyController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/register")
	public String register(@RequestParam("name") String name,
						   @RequestParam("email")String email,
						   @RequestParam("address")String address,
						   Model model) {
		
		model.addAttribute("Myname", name);
		model.addAttribute("Myemail", email);
		model.addAttribute("Myaddress", address);
		
		return "register";
	}

}
