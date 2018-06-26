package com.javasoft.service;

import java.util.List;

import com.javasoft.vo.MemberVO;

public interface MemberService {
	void insertMember(MemberVO member);
	List<MemberVO> select();
	MemberVO selectMember(String userid);
	void updateMember(MemberVO member);
	void deleteMember(String userid);
}
