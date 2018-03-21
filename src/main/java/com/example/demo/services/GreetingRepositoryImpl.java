package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {
	public final static String EN_GREETING="Hello Spring!";
    public final static String ES_GREETING="Espanlo alo";
	@Override
	public String displayEnglishGreeting() {
		// TODO Auto-generated method stub
		return EN_GREETING;
	}
	@Override
	public String displaySpanishGreeting() {
		// TODO Auto-generated method stub
		return ES_GREETING;
	}

}
