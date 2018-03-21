package com.example.demo.controller;

import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceImpl;

public class DiViaSettersCtrl {
	private GreetingService greetingService;

	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.greeting();
	}
	
}
