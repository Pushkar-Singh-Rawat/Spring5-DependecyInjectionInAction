package com.example.demo.controllerTestFiles;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.controller.DIViaPropertiesCtrl;
import com.example.demo.services.GreetingServiceImpl;

public class TestDIViaParametersCtrl {
private DIViaPropertiesCtrl dIViaParametersCtrl;
@Before
public void setup() throws Exception{
	this.dIViaParametersCtrl =new DIViaPropertiesCtrl();
	this.dIViaParametersCtrl.greetingService=new GreetingServiceImpl();
}
@Test
public void testGreeting() throws Exception {
	assertEquals(GreetingServiceImpl.HELLO_SPRING,dIViaParametersCtrl.sayHello());
}
}
