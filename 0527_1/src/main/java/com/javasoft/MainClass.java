package com.javasoft;

import java.sql.Connection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext (MyDataSource.class);
		Connection conn =(Connection)ctx.getBean("conn");
		
		System.out.println(conn);
		ctx.close();
	}
}
