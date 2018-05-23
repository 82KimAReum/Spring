package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javasoft.Hello;
import com.javasoft.Printer;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=
				new GenericXmlApplicationContext("config/beans.xml");
		Hello hello =ctx.getBean("hello",Hello.class);
		Printer printer= ctx.getBean("sp",Printer.class);
		
		if(printer == hello.getPrinter())
			System.out.println("Equals");
		else
			System.out.println("Different");
		
		if("¹ÚÁö¹Î".equals( hello.getName()  ))
			System.out.println("Equals");
		else
			System.out.println("Different");
		
	}
}
