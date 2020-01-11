package com.bridgelabz.springboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  	// Whenever you get a URL request your spring boot application will
					//  make sure that this controller will handle the URL request
public class SpringController {
	@RequestMapping("/hello")  // Mentions Which request you want to handle
	public String run()
	{
		return "Hi..";
	}

}
