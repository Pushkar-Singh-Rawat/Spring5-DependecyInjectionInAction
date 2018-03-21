package com.example.demo.services;

public class GreetingServiceFactory {
	// lets look into bean factories.
	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {

		switch (lang) {
		case "en":
			return new PrimaryEnglishGreetingService(greetingRepository);
		case "es":
			return new PrimarySpanishGreetingService(greetingRepository);
		default:
			return new PrimaryEnglishGreetingService(greetingRepository);
		}
	}

}
