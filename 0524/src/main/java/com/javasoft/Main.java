package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//1.Container생성
		AbstractApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		StudentInfo info =ctx.getBean("info",StudentInfo.class);
		info.print();
		
		Student student1= ctx.getBean("student1",Student.class);
		if(student1 == info.getStudent())System.out.println("Equals");
		else System.out.println("Different");
		ctx.close();
		
	}
}
