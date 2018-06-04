package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.MemberVO;

public interface MemberService {
	int insert(MemberVO memverVO);
	MemberVO select(String userid);
	List<MemberVO>selectAll();
	int update(MemberVO memberVO);
	int delete(String userid);
}
