package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.CityVO;

public interface CityDao {
	List<CityVO> readAll();
	CityVO read(String name);
}
