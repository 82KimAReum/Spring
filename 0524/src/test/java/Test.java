import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javasoft.Student;
import com.javasoft.StudentInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test {
	@Autowired
	private AbstractApplicationContext ctx;
	/*@Before
	public void init() {
		String path="classpath:applicationContext.xml";
		this.ctx= new GenericXmlApplicationContext(path);
	}*/
	@org.junit.Test
	public void test() {
		Student student1= ctx.getBean("student1", Student.class);
		assertEquals("박지민", student1.getName());
	}
	@org.junit.Test
	public void test1() {
		Student student1= ctx.getBean("student1",Student.class);
		StudentInfo info =this.ctx.getBean("info" ,StudentInfo.class);
		assertSame(student1, info.getStudent());
	}
	/*@After
	public void destroy() {
		ctx.close();
	}
	*/
}
