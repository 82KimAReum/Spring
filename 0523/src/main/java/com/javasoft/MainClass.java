package com.javasoft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//1.Spring container생성
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:beans.xml");
		//2.Spring container 에서 객체를 가져옴
		MyInfo munse= (MyInfo)ctx.getBean("info");
		munse.print();
		ctx.close();
	}
}
