package com.javasoft;

import org.springframework.stereotype.Component;

@Component("sp")
public class StringPrinter implements Printer {
	private StringBuffer sb;
	
	public StringPrinter() {
		this.sb = new StringBuffer("");
	}
	
	@Override
	public void print(String msg) {
		this.sb.append(msg);
	}

	@Override
	public String  toString() {
		return sb.toString();
	}
}
