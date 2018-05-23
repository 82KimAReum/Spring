package com.javasoft;

public class StringPrinter implements Printer {
	private StringBuffer sb ;
	
	public StringPrinter() {
		this.sb = new StringBuffer("");
	}

	@Override
	public void print(String msg) {
		sb.append(msg);
	}
	public String toString() {
		return sb.toString();
	}
	
}
