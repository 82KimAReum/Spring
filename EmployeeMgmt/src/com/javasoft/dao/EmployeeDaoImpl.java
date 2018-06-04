package com.javasoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.EmployeeVO;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<EmployeeVO> read() {
		
		String sql="select empno,ename,job,hiredate "+
				"from emp order by empno desc";
		List<EmployeeVO>list =
				this.jdbcTemplate.query(sql, new MyMapper());
		return list;
	}
	class MyMapper implements RowMapper{
		@Override
		public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new EmployeeVO(rs.getInt("empno"),
							rs.getString("ename"),
							rs.getString("job"),
							rs.getDate("hiredate"));
		}
	}
}
