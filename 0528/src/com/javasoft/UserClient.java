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
			//����Ŭ�� ���۱� ������ applicationContext.xml���� ���� ���ϹǷ� 
			//���� ���� Odbc6.jar������build Path�� �ٰ�
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
}
