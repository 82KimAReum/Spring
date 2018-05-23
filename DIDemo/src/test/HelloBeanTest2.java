package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javasoft.Hello;

public class HelloBeanTest2 {
	private ApplicationContext ctx;
	@Before
	public void init() {
		this.ctx= new GenericXmlApplicationContext("resources/beans.xml");
	}
	@Test
	public void aaa() {
		Hello hello= ctx.getBean("hello",Hello.class );
		//System.out.println(hello.sayHello());
		//java - ea
		//assert  : 
	}
	@After
	public void bbb() {
		
	}
	
}
