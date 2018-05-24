package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarMain {
	public static void main(String[] args) {
		/*Car hc= new HybridCar();
		hc.drive();
		*/
		
		String path= "classpath:beans.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(path);
		Car car= (Car)ctx.getBean("car" );
		car.drive();
		ctx.close();
	}
}
