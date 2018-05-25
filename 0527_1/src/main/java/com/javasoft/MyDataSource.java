package com.javasoft;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class MyDataSource {
	@Value("${db.driver}")
	private String driver;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer config=
				new PropertySourcesPlaceholderConfigurer();
		
		Resource [] array=new Resource[2];
		array[0]= new ClassPathResource("dbinfo.properties");
		array[1]= new ClassPathResource("dbinfo1.properties");
			
		config.setLocations(array);
		
		return config;
	}
	@Bean
	public Connection conn()  {
		Connection conn= null;
		try {
			Class.forName(this.driver);
			conn=DriverManager.getConnection(this.url, this.username, this.password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}
