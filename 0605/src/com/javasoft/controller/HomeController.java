package com.javasoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javasoft.service.MemberService;
import com.javasoft.vo.MemberVO;

@Controller
public class HomeController {
	@Autowired
	private MemberService memberService;
	
	/*@RequestMapping(value = "/home.do")
	public String home(Model model) {
		model.addAttribute("greeting", "Good Morning");
		return "home";
	}*/
	@RequestMapping(value="/members/{userid}",method=RequestMethod.GET)
	@ResponseBody
	public Map memberInfo(@PathVariable String userid) {
		
		MemberVO member =this.memberService.selectMember(userid); 
		Map<String , Object>map=new HashMap<String,Object>();
		map.put("code","success");
		map.put("data",member);
		return map;
	}
	@RequestMapping(value="/members", method=RequestMethod.GET)
	@ResponseBody
	public Map members() {
		List<MemberVO>list =
				this.memberService.select();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "seccess");
		map.put("data",list);
		return map;
	}
	@RequestMapping(value="/members",method=RequestMethod.POST)
	@ResponseBody
	public Map insert(@RequestBody MemberVO memberVO) {
		this.memberService.insertMember(memberVO);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "seccess");
		return map;
	}
	@RequestMapping(value="/members/{userid}",method=RequestMethod.DELETE)
	@ResponseBody
	public Map delete(@PathVariable String userid) {
		this.memberService.deleteMember(userid);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "seccess");
		return map;
	}
	@RequestMapping(value="/members",method=RequestMethod.PUT)
	@ResponseBody
	public Map update(@RequestBody MemberVO memberVO) {
		this.memberService.updateMember(memberVO);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "seccess");
		return map;
	}
}
