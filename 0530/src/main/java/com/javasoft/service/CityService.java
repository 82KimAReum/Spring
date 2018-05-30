package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.CityVO;

public interface CityService {
	List<CityVO>selectAll();
	CityVO select(String name);
}
