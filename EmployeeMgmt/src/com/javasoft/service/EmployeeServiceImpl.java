package com.javasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.dao.EmployeeDao;
import com.javasoft.vo.EmployeeVO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<EmployeeVO> select() {
		
		return this.employeeDao.read();
	}

}
