package com.javasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.dao.MemberDao;
import com.javasoft.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public void insertMember(MemberVO member) {
		this.memberDao.create(member);
	}
	
	public List<MemberVO> select(){
		return this.memberDao.selelct();
		
	}
	public MemberVO selectOne(String userid) {
		return this.memberDao.selectOne(userid);
	}

}
