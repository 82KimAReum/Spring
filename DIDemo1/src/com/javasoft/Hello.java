package com.javasoft;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Hello {
	private List<String>names;
	private Set<String> editors;
	private Map<String,Integer>ages; 
	private Properties addresses;
	
	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getNames() {
		return names;
	}

	public Set<String> getEditors() {
		return editors;
	}

	public void setEditors(Set<String> editors) {
		this.editors = editors;
	}

	public Map<String, Integer> getAges() {
		return ages;
	}

	public void setAges(Map<String, Integer> ages) {
		this.ages = ages;
	}

	public Properties getAddresses() {
		return addresses;
	}

	public void setAddresses(Properties addresses) {
		this.addresses = addresses;
	}
	
}
