package com.javasoft;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		//외부 환경 설정 파일 받아오기
		ConfigurableApplicationContext configContext=
				new GenericXmlApplicationContext();
		ConfigurableEnvironment env= configContext.getEnvironment();
		MutablePropertySources source= env.getPropertySources();
		try {
			//실제 properties파일의 경로
			source.addLast(new ResourcePropertySource("classpath:oracle.properties"));
			source.addLast(new ResourcePropertySource("classpath:mariadb.properties"));
			
			System.out.println(env.getProperty("db.username"));
		} catch (IOException e) {
			System.out.println("file not found");
		}
		
		
		String path="classpath:beans.xml";
		GenericXmlApplicationContext gCtx=(GenericXmlApplicationContext)configContext;
		gCtx.load(path);//반드시 load()하면 refresh()해야 한다.
		gCtx.refresh();
		//GenericXmlApplicationContext ctx=	new GenericXmlApplicationContext(path);
		
		AdminConnection adminConn=gCtx.getBean("adminConn",AdminConnection.class);
		
		
		System.out.println(adminConn.getDriver());
		System.out.println(adminConn.getUrl());
		System.out.println(adminConn.getUsername());
		System.out.println(adminConn.getPassword());
				
		//ctx.close();
		gCtx.close();
		configContext.close();
	}
}
