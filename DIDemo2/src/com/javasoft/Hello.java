package com.javasoft;

public class Hello {
	private String name;
	private Printer printer;
	
	public Hello(String name, Printer printer) {	
		this.name = name;
		this.printer = printer;
	}

	public String getName() {
		return name;
	}

	public Printer getPrinter() {
		return printer;
	}
	
	
}
