package com.javasoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "classpath:applicationContext.xml";
		String path1 = "classpath:applicationContext1.xml";
		AbstractApplicationContext ctx = null;
		ApplicationContext ctx1 = null;
		ctx = new GenericXmlApplicationContext(path);
		ctx1 = new GenericXmlApplicationContext(path1);
		Student [] array = new Student[2];
		array[0] = ctx.getBean("student1", Student.class);
		array[1] = (Student)ctx1.getBean("student2");
		for(Student s : array) System.out.println(s);
		
		Product ballpen = ctx1.getBean("ballpen", Product.class);
		System.out.println(ballpen);
		ctx.close();
	}
}
