package com.javasoft;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path="classpath:applicationContext.xml";
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(path);
		Student student1= ctx.getBean("student1",Student.class);
		System.out.println(student1);
		ctx.close();
	}
}
