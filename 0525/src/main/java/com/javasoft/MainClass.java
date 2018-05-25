package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//1.Container생성
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:beans.xml");
		//2.Bean사용
		Student student= ctx.getBean("student1",Student.class);
		System.out.println(student);
		
		//3.Container종료
		//Container종료되면 자동으로 bean이 소멸
		//bean만 소멸시키려면 student.destroy()사용
		
		ctx.close();
	}
}
