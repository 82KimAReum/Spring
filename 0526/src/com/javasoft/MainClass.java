package com.javasoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path="config/applicationContext.xml";
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext ();
		ctx.load(path);
		ctx.refresh();
		/*Student student = (Student) ctx.getBean("student1");
		System.out.println(student);
		*/
		Product car= ctx.getBean("car",Product.class);
		System.out.println(car);
		
		ctx.close();
	}
}
