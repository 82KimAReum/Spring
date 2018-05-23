package com.javasoft;

public class Hello {
	private String name;
	private Printer printer;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public Printer getPrinter() {
		return this.printer;
	}
	public String sayHello() {
		return "hello " + this.name;
	}
	public void greeting() {
		this.printer.print(this.sayHello());
	}
}
