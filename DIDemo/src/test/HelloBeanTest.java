package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javasoft.Hello;
import com.javasoft.Printer;

public class HelloBeanTest {
	//1. IoC container생성
	public static void main(String[] args) {
		GenericApplicationContext ctx= 
				new GenericXmlApplicationContext("resources/beans.xml");
	//2.Hello bean 가져옴
		Hello hello= ctx.getBean("hello",Hello.class );
		
//		hello.greeting();
//		Printer p= hello.getPrinter();
//		System.out.println(p);

		//System.out.println(hello.sayHello());
		
	//3.
		Printer printer =(Printer)ctx.getBean("sp");
		System.out.println(printer);//빈 출력
		Hello hello1= (Hello)ctx.getBean("hello");
		hello1.greeting();
		System.out.println(printer);
		/////////////////////////////////////////////////////////
		if(hello==hello1) {//같음
			System.out.println("equals");
			//bean설정 파일을 통해 만들면 bean은 무조건 하나의 주소로 만들어짐
		}else {
			System.out.println("different");
		}
		ctx.close();
	}
}
