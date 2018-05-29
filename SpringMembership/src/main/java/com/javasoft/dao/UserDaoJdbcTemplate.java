package com.javasoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.UserVO;

@Repository("userDao3")
public class UserDaoJdbcTemplate implements UserDao {
	private JdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource); 
		
	}
	
	

	class UserMapper implements RowMapper<UserVO> {
		@Override
	    public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
	      UserVO user = new UserVO();
	      user.setUserid(rs.getString("userid"));
	      user.setIrum(rs.getString("irum"));
	      user.setGender(rs.getString("gender"));
	      user.setCity(rs.getString("city"));
	      return user;
	    }
	  };
	
	
	
	@Override
	public void insert(UserVO user) {
		/*Connection conn = null;
		CallableStatement cstmt = null;
		try {
			conn = this.dataSource.getConnection();
			cstmt = conn.prepareCall("{call sp_membership_insert(?,?,?,?)}");
			cstmt.setString(1, user.getUserid());
			cstmt.setString(2, user.getIrum());
			cstmt.setString(3, String.valueOf(user.getGender()));
			cstmt.setString(4, user.getCity());
			cstmt.executeUpdate();
			System.out.println("Insert Success : " + user.getUserid());
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			try {
				if(cstmt != null) cstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}*/
	}

	@Override
	public List<UserVO> selectAll() {
		return null;
		/*Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		try {
			conn = this.dataSource.getConnection();
			cstmt = conn.prepareCall("{call sp_membership_selectall(?)}");
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.executeUpdate();   //매우 주의할 것
			rs = (ResultSet)cstmt.getObject(1);
			while(rs.next()) {
				UserVO user = new UserVO(rs.getString("userid"),
						        rs.getString("irum"), rs.getString("gender"),
						        rs.getString("city"));
				list.add(user);
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			try {
				if(rs != null) rs.close();
				if(cstmt != null) cstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}
		return list;*/
	}

	@Override
	public UserVO selectOne(String userid) {
		String sql = "SELECT * FROM Membership WHERE userid = ?";
		UserVO user = null;
		try {
		user = this.template.queryForObject(sql, 
				new Object[] {userid}, new UserMapper());
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return user;
	}

	@Override
	public void delete(String userid) {
		/*Connection conn = null;
		CallableStatement cstmt = null;
		try {
			conn = this.dataSource.getConnection();
			cstmt = conn.prepareCall("{call sp_membership_delete(?)}");
			cstmt.setString(1, userid);
			cstmt.executeUpdate();
			System.out.println("Delete Success : " + userid);
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			try {
				if(cstmt != null) cstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}*/
	}

	@Override
	public void update(UserVO user) {
		/*Connection conn = null;
		CallableStatement cstmt = null;
		try {
			conn = this.dataSource.getConnection();
			cstmt = conn.prepareCall("{call sp_membership_update(?, ?, ?)}");
			cstmt.setString(1, user.getUserid());
			cstmt.setString(2, user.getIrum());
			cstmt.setString(3, user.getCity());
			cstmt.executeUpdate();
			System.out.println("Update Success : " + user.getUserid());
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			try {
				if(cstmt != null) cstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}*/
	}
}
