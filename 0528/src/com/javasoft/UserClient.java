package com.javasoft;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserClient {
	public static void main(String[] args) {
		String path="config/applicationContext.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		DataSource ds =ctx.getBean("dataSource",DataSource.class);
		try {
			Connection conn =ds.getConnection();
			System.out.println(conn);
			//오라클은 저작권 문제로 applicationContext.xml에서 설정 못하므로 
			//직접 받은 Odbc6.jar파일을build Path해 줄것
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
}
