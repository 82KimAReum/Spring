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
		this.sqlSession.insert("Member.insert",member);
	}

	@Override
	public List<MemberVO> readAll() {
		return sqlSession.selectList("Member.select");
	}

	@Override
	public MemberVO read(String userid) {
		return this.sqlSession.selectOne("Member.selectMember",userid);
	}

	@Override
	public void update(MemberVO member) {
		this.sqlSession.update("Member.update", member);
	}

	@Override
	public void delete(String userid) {
		this.sqlSession.delete("Member.delete",userid);
		
	}
	

}
