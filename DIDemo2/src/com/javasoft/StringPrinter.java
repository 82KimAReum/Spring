package com.javasoft;

public class StringPrinter implements Printer {
	private StringBuffer sb;
	@Override
	public void print(String msg) {
		this.sb.append(msg);
	}
	public String toString() {
		return this.sb.toString();
	}
}
