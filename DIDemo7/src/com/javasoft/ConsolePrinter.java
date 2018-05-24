package com.javasoft;

import org.springframework.stereotype.Component;

@Component("cp")
public class ConsolePrinter implements Printer {

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}
