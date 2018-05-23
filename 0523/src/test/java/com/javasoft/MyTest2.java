package com.javasoft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class MyTest2 {
	@Autowired
	private AbstractApplicationContext ctx;
	
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
	
}
