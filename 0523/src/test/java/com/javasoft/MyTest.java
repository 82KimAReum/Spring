package com.javasoft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTest {
	private AbstractApplicationContext ctx;
	@Before
	public void init() {
		ctx=new GenericXmlApplicationContext("classpath:beans.xml");
	}
	@Test
	public void test() {
		MyInfo info= (MyInfo) ctx.getBean("info");
		assertEquals("이문세", info.getName());
	}
	@Test
	public void test1() {
		MyInfo info = (MyInfo) this.ctx.getBean("info");
		MyInfo info1= this.ctx.getBean("info",MyInfo.class);
		assertSame(info, info1);
	}
	@After
	public void  close() {
		this.ctx.close();
	}
}
