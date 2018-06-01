package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.MemberVO;


public interface MemberDao {
	
	void create(MemberVO member);
	List<MemberVO> selelct();
	MemberVO selectOne(String userid);
}
