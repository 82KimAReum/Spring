package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javasoft.Calculator;
import com.javasoft.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyTest {
	@Autowired
	AbstractApplicationContext ctx ;
	
	@Test
	public void test() {
		Student student1 =ctx.getBean("student1",Student.class);
		System.out.println(student1);
		Calculator calculator= ctx.getBean("calculator",Calculator.class);
		calculator.calcBmi();
	}

}
