package com.javasoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		Hello hello= new Hello();
//		hello.setName("설운");
//		Printer cp =new ConsolePrinter();
//		hello.setPrinter(cp);
//		hello.greeting();
		
		ApplicationContext ctx= new GenericXmlApplicationContext("classpath:beans.xml");
		Hello hello= ctx.getBean("hello",Hello.class);
		hello.greeting();
		Printer p= hello.getPrinter();
		System.out.println(p);
	}
}
