package com.javasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.dao.CityDao;
import com.javasoft.vo.CityVO;

@Service("cityService")
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<CityVO> selectAll() {
		return this.selectAll();
	}

	@Override
	public CityVO select(String name) {
		return this.cityDao.read(name);
		
	}

}
