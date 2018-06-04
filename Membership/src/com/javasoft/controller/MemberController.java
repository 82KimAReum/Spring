package com.javasoft.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javasoft.service.MemberService;
import com.javasoft.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/{userid}",method=RequestMethod.GET)
	@ResponseBody
	public Map memberInfo(@PathVariable String userid) {
		//rest ful����� � return ~~.jspó�� �������� ���� �����ʰ�
		//@ResponseBody�� ����ϰ� json���� ��ȯ�Ǽ��� ������
		MemberVO member =this.memberService.select(userid); 
		Map<String , Object>map=new HashMap<String,Object>();
		map.put("code","success");
		map.put("data",member);
		return map;
	}
}
