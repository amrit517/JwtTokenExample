package com.jwttoken.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jwt")
public class HomeController {
	
	
	@RequestMapping("/home")
	public String getHome() {
		return "welcome";
	}

}
