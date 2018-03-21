package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class DiDemoController {
	private GreetingService greetingService;

	
	public DiDemoController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String diDemo() {
		System.out.println(greetingService.greeting());
		return "hello";
	}
}
