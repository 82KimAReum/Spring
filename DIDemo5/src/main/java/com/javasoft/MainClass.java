package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//bean configuration 에서 annotation을 포함해서 이용하는 방법
		String path="classpath:applicationContext.xml";
		AbstractApplicationContext ctx= 
				new GenericXmlApplicationContext(path);
		
		Student student1=ctx.getBean("student1",Student.class); 
		Student student2=(Student)ctx.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
		ctx.close();
	}
}
