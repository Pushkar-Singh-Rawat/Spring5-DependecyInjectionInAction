package com.example.demo.controller;

import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceImpl;

public class DIViaPropertiesCtrl {

	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.greeting();
	}
}
