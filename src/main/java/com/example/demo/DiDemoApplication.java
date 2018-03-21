package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.DiDemoController;
import com.example.demo.controller.DiViaConstructorCtrl;
import com.example.demo.examplebeans.FakeDataSource;
import com.example.demo.examplebeans.FakeJmsSource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext sctx=SpringApplication.run(DiDemoApplication.class, args);
		DiDemoController diDemoController=(DiDemoController) sctx.getBean("diDemoController");
		
		FakeDataSource fakeDataSource=(FakeDataSource)sctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getName());
		FakeJmsSource fakeJmsSource=(FakeJmsSource)sctx.getBean(FakeJmsSource.class);
		System.out.println(fakeJmsSource.getUsername());
		
		/*System.out.println(diDemoController.diDemo());*/
		
		
		/*DiViaConstructorCtrl diViaConstructorCtrl =(DiViaConstructorCtrl) sctx.getBean("diViaConstructorCtrl");
		System.out.println(diViaConstructorCtrl.sayHello());*/
		//System.out.println(sctx.getBean(DiViaConstructorCtrl.class).sayHello());
	}
}
