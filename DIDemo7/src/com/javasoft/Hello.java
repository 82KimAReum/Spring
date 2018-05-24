package com.javasoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	@Value("한지민")
	private String name;
	
	@Autowired
	@Qualifier("sp")
	private Printer printer;
	
	
	public Printer getPrinter() {
		return this.printer;
	}
	
	public String sayHello() {
		return "Hello!!! " + this.name; 
	}
	public void greeting() {
		this.printer.print(this.sayHello());
	}
}
