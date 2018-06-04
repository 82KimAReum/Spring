package com.javasoft.dao;

import java.util.List;

import com.javasoft.vo.MemberVO;

public interface MemberDao {
	int create(MemberVO memverVO);
	MemberVO read(String userid);
	List<MemberVO>readAll();
	int update(MemberVO memberVO);
	int delete(String userid);
}
