package com.javasoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//어노테이션
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(StudentInfo.class);
		
		Student student1= ctx.getBean("student1",Student.class);
		System.out.println(student1);
		Student student2= (Student)ctx.getBean("student2");
		System.out.println(student2);
		
		ctx.close();
	}
}
