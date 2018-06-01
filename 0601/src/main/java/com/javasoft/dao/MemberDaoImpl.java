package com.javasoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import com.javasoft.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void create(MemberVO member) {
		this.sqlSession.insert("Member.insert", member);
	}
	@Override
	public List<MemberVO> selelct(){
		return this.sqlSession.selectList("Member.select");
	}
	public MemberVO selectOne(String userid) {
		return this.sqlSession.selectOne("Member.selectOne", userid);
	}
}
