package com.javasoft;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		/*Student jimin= new Student("한지민", 24);
		System.out.println(jimin);
		*/
		
		
		//1.Container생성
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:beans.xml");
		//2.Bean사용
		Student student= ctx.getBean("jimin",Student.class);
		System.out.println(student);
		
		Student student1= ctx.getBean("jimin",Student.class);
		student1.setName("설운도");
		student1.setAge(69);
		System.out.println(student1);
		System.out.println(student);
		
		if(student==student1)System.out.println("Equals");
		else System.out.println("Different");
		
		
//		Product car = ctx.getBean("car",Product.class);
//		System.out.println(car);
		
		//3.Container종료
		//Container종료되면 자동으로 bean이 소멸
		//bean만 소멸시키려면 student.destroy()사용
		
		ctx.close();
	}
}
