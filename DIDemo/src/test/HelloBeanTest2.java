/*package test;


import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;//메소드를 임폴트할때는 ()를 쓰지 않음
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


import com.javasoft.Hello;
import com.javasoft.Printer;

public class HelloBeanTest2 {
	private ApplicationContext ctx;
	@Before
	public void init() {
		this.ctx= new GenericXmlApplicationContext("resources/beans.xml");
	}
	@Test @Ignore
	public void aaa() {
		Hello hello= ctx.getBean("hello",Hello.class );
		//System.out.println(hello.sayHello());
		//java - ea
		//assert  : 
		assertEquals("hello 한지민",hello.sayHello());//앞의 값과 뒤의 값이 같은 지
		
		Printer printer=(Printer) this.ctx.getBean("sp");
		printer.print("Spring");
		assertEquals("Spring", printer.toString());
		
	}
	@After
	public void bbb() {
		Hello hello= ctx.getBean("hello",Hello.class );
		Hello hello1= (Hello)ctx.getBean("hello");
		assertSame(hello, hello1);//주소가 같은가
	}
	
}
*/