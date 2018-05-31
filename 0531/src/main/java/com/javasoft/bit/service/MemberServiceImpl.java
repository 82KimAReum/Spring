package com.javasoft.bit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasoft.bit.dao.MemberDao;
import com.javasoft.bit.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int insertMember(MemberVO member) {
		return this.memberDao.create(member);
	}

}
