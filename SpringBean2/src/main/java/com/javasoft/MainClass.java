package com.javasoft;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) throws SQLException {
		String path="classpath:beans.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		
		Hello hello= (Hello) ctx.getBean("hello");
		DataSource ds=hello.getDataSource();
		Connection conn =ds.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select count(*) from city");
		rs.next();
		System.out.println(rs.getInt(1));
		if(rs!= null)rs.close();
		if(stmt!= null)stmt.close();
		if(conn!= null)conn.close();
		System.out.println(ds);
		ctx.close();
	}
}
