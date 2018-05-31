package com.javasoft.bit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javasoft.bit.vo.MemberVO;


public interface MemberDao {
	
	
	int create(MemberVO member);
}
