package com.javasoft;

import javax.sql.DataSource;



//@ContextConfiguration(locations="classpath:beans.xml")
public class Hello {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}
	
}
