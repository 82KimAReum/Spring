package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javasoft.Hello;
import com.javasoft.Printer;

public class HelloBeanTest {
	//1. IoC container����
	public static void main(String[] args) {
		GenericApplicationContext ctx= 
				new GenericXmlApplicationContext("resources/beans.xml");
	//2.Hello bean ������
		Hello hello= ctx.getBean("hello",Hello.class );
		
//		hello.greeting();
//		Printer p= hello.getPrinter();
//		System.out.println(p);

		//System.out.println(hello.sayHello());
		
	//3.
		Printer printer =(Printer)ctx.getBean("sp");
		System.out.println(printer);//�� ���
		Hello hello1= (Hello)ctx.getBean("hello");
		hello1.greeting();
		System.out.println(printer);
		/////////////////////////////////////////////////////////
		if(hello==hello1) {//����
			System.out.println("equals");
			//bean���� ������ ���� ����� bean�� ������ �ϳ��� �ּҷ� �������
		}else {
			System.out.println("different");
		}
		ctx.close();
	}
}
