package com.javasoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.StudentVO;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(StudentVO s) {
		String sql = "INSERT INTO Student(hakbun, irum, kor, eng, mat, edp, " +
						   "sum, avg, grade) VALUES(?,?,?,?,?,?,?,?,?)";
		return this.jdbcTemplate.update(sql, s.getHakbun(), s.getIrum(), s.getKor(), 
				s.getEng(), s.getMat(), s.getEdp(), s.getSum(), s.getAvg(), s.getGrade());
	}
	
	
	private class StudentMapper implements RowMapper<StudentVO>{
		public StudentVO mapRow(java.sql.ResultSet rs,int rowNum) throws java.sql.SQLException{
			StudentVO student = new StudentVO(
					rs.getString("hakbun"),rs.getString("irum"),rs.getInt("kor"),
					rs.getInt("eng"),rs.getInt("mat"),rs.getInt("edp"),rs.getInt("sum")
					,rs.getDouble("avg"),rs.getString("grade"));
			
			return student;
		}
	}
	
	@Override
	public List<StudentVO> readAll() {
		String sql="select * from Student";
		return this.jdbcTemplate.query(sql, new StudentMapper());
	}

	@Override
	public StudentVO read(String hakbun) {
		String sql="select * from Student where hakbun=?";
		return this.jdbcTemplate.queryForObject(sql, new Object[] {hakbun}, new StudentMapper());
	}

	@Override
	public int update(StudentVO s) {
		
		String sql="update Student set kor=?, eng=?, mat=?, edp=?,sum=?,avg=?,grade=? "
				+"where hakbun=?";
		return this.jdbcTemplate.update(sql, s.getKor(),s.getEng(),s.getMat(),s.getEdp(),s.getSum(),s.getAvg(),s.getGrade(),s.getHakbun());
	}

	@Override
	public int delete(String hakbun) {
		String sql= "delete from Student where hakbun =?";
		return this.jdbcTemplate.update(sql,hakbun);
	}

}
