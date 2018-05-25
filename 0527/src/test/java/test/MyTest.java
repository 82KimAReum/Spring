package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javasoft.Student;

public class MyTest {
	
	private GenericXmlApplicationContext ctx;
	private Student student;
	
	@Before
	public void init() {
		String path="classpath:applicationContext.xml";
		ctx= new GenericXmlApplicationContext(path);
		student= this.ctx.getBean("student1",Student.class);
	}
	@Test
	public void test() {		
		assertEquals("손호준", student.getName());
		assertEquals(18, student.getAge());
	}
	@Test
	public void test1() {		
		
		Object[] hobbies =student.getHobbies().toArray();
		Object[] array= {"독서","영화감상"};
		assertArrayEquals(array, hobbies);
		//Set<String> set=student.getSubjects();
		assertEquals("[국어, 전산, 음악]",student.getSubjects().toString() );
	}
	@After
	public void destroy() throws Exception {
		student.destroy();
		ctx.close();
	}
}
