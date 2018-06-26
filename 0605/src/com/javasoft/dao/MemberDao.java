package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.MemberVO;

public interface MemberDao {
	void create(MemberVO member);
	List<MemberVO> readAll();
	MemberVO read(String userid);
	void update(MemberVO member);
	void delete(String userid);
}
