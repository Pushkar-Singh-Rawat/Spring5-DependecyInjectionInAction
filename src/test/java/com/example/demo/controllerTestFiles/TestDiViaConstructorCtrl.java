package com.example.demo.controllerTestFiles;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.controller.DiViaConstructorCtrl;
import com.example.demo.services.GreetingServiceImpl;

public class TestDiViaConstructorCtrl {

	private DiViaConstructorCtrl diViaConstructorCtrl;
	
	@Before
	public void setup() {
		this.diViaConstructorCtrl=new DiViaConstructorCtrl(new GreetingServiceImpl());
	}
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_SPRING,diViaConstructorCtrl.sayHello());
		
	}
}
