package com.example.demo.services;

//primarygreetingservice bean
/*@Service
 * @Profile("en")
 * @Primary  
 * */
public class PrimaryEnglishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return greetingRepository.displayEnglishGreeting();
	}
	
	
}
