package com.javasoft.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.CityVO;

@Repository("cityDao")
public class CityDaoImpl implements CityDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<CityVO> readAll() {
		
		return null;
	}

	@Override
	public CityVO read(String name) {
		CityVO city=this.sqlsession.selectOne("City.selectOne", name);
		return city;
	}

}
