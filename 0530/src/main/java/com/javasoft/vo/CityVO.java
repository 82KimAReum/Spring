package com.javasoft.vo;

public class CityVO {
	private int id;
	private String name;
	private String countrycode;
	private String district;
	private String population;
	public CityVO() {
		// TODO Auto-generated constructor stub
	}
	public CityVO(int id, String name, String countrycode, String district, String population) {
		//super();
		this.id = id;
		this.name = name;
		this.countrycode = countrycode;
		this.district = district;
		this.population = population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return String.format("CityVO [id=%s, name=%s, countrycode=%s, district=%s, population=%s]", id, name,
				countrycode, district, population);
	}
	
}
