package com.javasoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	class MyMapper implements RowMapper{
		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new MemberVO(rs.getString("userid"),
					rs.getString("name"),
					rs.getString("gender"),
					rs.getString("city"));
		}
	}
	@Override
	public int create(MemberVO memverVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO read(String userid) {
		String sql="select * from Member where userid=?";
		MemberVO member=(MemberVO)this.jdbcTemplate.queryForObject(sql, new Object[] {userid},new MyMapper());
		return member;
	}

	@Override
	public List<MemberVO> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
