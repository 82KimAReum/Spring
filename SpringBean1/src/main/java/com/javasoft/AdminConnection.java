package com.javasoft;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection 
	implements EnvironmentAware,InitializingBean,DisposableBean{

	private Environment environment;
	private String driver;
	private String url;
	private String username;
	private String password;
	
		
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("방금 bean소멸");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("방금 bean생성");
		this.setDriver(this.environment.getProperty("db.driver"));
		this.setUrl(this.environment.getProperty("db.url"));
		this.setUsername(this.environment.getProperty("db.username"));
		this.setPassword(this.environment.getProperty("db.password"));
	}

	@Override
	public void setEnvironment(Environment environment) {
		//bean이 생성될때, 가장 먼저 호출됨 
		System.out.println("called setEnvironment()");
		this.environment= environment;
		
	}

	
}
