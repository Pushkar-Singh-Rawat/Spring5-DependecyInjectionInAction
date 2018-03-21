package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceImpl;

@Controller
public class DiViaConstructorCtrl {
	private GreetingService greetingService;

	@Autowired //optional in case of DI via constructor
	public DiViaConstructorCtrl(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.greeting();
	}

}
