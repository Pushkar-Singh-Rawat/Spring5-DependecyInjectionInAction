package com.example.demo.services;

//primaryspanishgreetingservice bean
public class PrimarySpanishGreetingService implements GreetingService {
	private GreetingRepository greetingRepository;

	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return greetingRepository.displaySpanishGreeting();
	}
}
