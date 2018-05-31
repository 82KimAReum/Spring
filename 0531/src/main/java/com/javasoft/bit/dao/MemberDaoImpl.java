package com.javasoft.bit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javasoft.bit.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(MemberVO member) {
		String sql = "INSERT INTO Member(name, userid, gender, city) " +
	                 " VALUES(?,?,?,?)";
		return this.jdbcTemplate.update(sql, member.getName(), 
		       member.getUserid(), member.getGender(), member.getCity());
	}

}
