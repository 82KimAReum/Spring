package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configFile="classpath:beans.xml";
		AbstractApplicationContext ctx=
				new GenericXmlApplicationContext(configFile);
		//MyCalculator mc=new MyCalculator();
		MyCalculator mc=ctx.getBean("mc",MyCalculator.class);
		mc.addAction();
		mc.subAction();
		mc.mulAction();
		mc.adivAction();
	}
}
