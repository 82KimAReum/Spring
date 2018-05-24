package com.javasoft.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javasoft.ApplicationConfig;
import com.javasoft.Student;

public class MyTest {
	private AnnotationConfigApplicationContext ctx;
	@Before
	public void init() {
		this.ctx=
			new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}
	@Test
	public void test1() {
		Student student1=this.ctx.getBean("student1" ,Student.class);
		
		assertEquals("한지민", student1.getName());
	}
	@Test
	public void test2() {
		
		Student student2=(Student)this.ctx.getBean("student2");
		assertEquals("손호준", student2.getName());
	}
	@After
	public void destroy() {
		this.ctx.close();
	}
	
}
