package com.javasoft.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javasoft.vo.UserVO;

import oracle.jdbc.OracleTypes;

@Repository("userDao")//실제로 db와 연동할때 사용될 이름. 아래서 dataSource에@AutoWired됨
public class UserDaoImpl implements UserDao {
private DataSource dataSource;

@Autowired
public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}

	@Override
	public void insert(UserVO user) {
		Connection conn = null;
		CallableStatement cstmt= null;
		try {
			conn= this.dataSource.getConnection();
			cstmt= conn.prepareCall("{ call sp_membership_insert(?,?,?,?)}");
			cstmt.setString(1, user.getUserid());
			cstmt.setString(2, user.getIrum());
			cstmt.setString(3, user.getGender()+"");
			cstmt.setString(4, user.getCity());
			cstmt.executeUpdate();
			System.out.println("insert Success: "+user.getUserid());
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				
				if(cstmt!= null)cstmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}

	}

	@Override
	public List<UserVO> selectAll() {
		Connection conn = null;
		CallableStatement cstmt= null;
		ResultSet rs= null;
		List<UserVO>list =new ArrayList<UserVO>();
		try {
			conn= this.dataSource.getConnection();
			cstmt= conn.prepareCall("{ call sp_membership_selectall(?)}");
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.executeUpdate();
			rs= (ResultSet)cstmt.getObject(1);
			while(rs.next()) {
				list.add(new UserVO(rs.getString("userid"),rs.getString("irum"),rs.getString("gender"),rs.getString("city")));
				
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				
				if(cstmt!= null)cstmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}
		return list;
	}

	@Override
	public UserVO selectOne(String userid) {
		Connection conn= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		UserVO user = null;
		try {
			conn= this.dataSource.getConnection();
			String sql="select * from Membership where userid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				user= new UserVO(userid,rs.getString("irum"),rs.getString("gender"),rs.getString("city"));
			}
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				if(rs!= null)rs.close();
				if(pstmt!= null)pstmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}
		return user;
	}

	@Override
	public void delete(String userid) {
		Connection conn = null;
		CallableStatement cstmt= null;
		
		try {
			conn= this.dataSource.getConnection();
			cstmt= conn.prepareCall("{ call sp_membership_delete(?)}");
			cstmt.setString(1, userid);
			cstmt.executeUpdate();
			System.out.println("Delete Success: "+userid);
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				
				if(cstmt!= null)cstmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}

	}

	@Override
	public void update(UserVO user) {
		Connection conn = null;
		CallableStatement cstmt= null;
		ResultSet rs= null;
		
		try {
			conn= this.dataSource.getConnection();
			cstmt= conn.prepareCall("{ call sp_membership_update(?,?,?)}");
			cstmt.setString(1, user.getUserid());
			cstmt.setString(2, user.getIrum());
			cstmt.setString(3, user.getCity());
			cstmt.executeUpdate();
			System.out.println("Update Success: "+user.getUserid());
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				
				if(cstmt!= null)cstmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}

	}

}
