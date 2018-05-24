package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config= "config/beans.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(config);
		//Printer printer =ctx.getBean("sp",StringPrinter.class);
		Hello hello= ctx.getBean("hello",Hello.class);
		hello.greeting();
		Printer printer = hello.getPrinter();
		System.out.println(printer);
	}
}
