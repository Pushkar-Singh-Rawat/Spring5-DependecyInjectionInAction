package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.example.demo.services.GreetingRepository;
import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceFactory;
import com.example.demo.services.PrimaryEnglishGreetingService;

@Configuration
public class GreetingServiceConfig {


	@Bean
	public GreetingServiceFactory createGreetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}
	
	@Bean
	@Primary
	@Profile({"default","en"})
	public GreetingService primaryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}
	@Bean
	@Primary
	@Profile("es")
	public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}
	
	
	
}

