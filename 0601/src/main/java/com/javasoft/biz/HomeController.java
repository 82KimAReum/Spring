package com.javasoft.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javasoft.service.MemberService;
import com.javasoft.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private MemberService memberService;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<MemberVO> list =this.memberService.select();
		model.addAttribute("memberlist", list);
		
		return "home";
	}
	
	//1.HttpServletRequest를 이용한다.
	//2.@RequestParam을 이용한다.
	//3.Data Commander객체(VO)를 이용하는 방법
	//4.@PathVariable을 이용한다.
	
	/*
	 * @RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(@RequestParam("userid") String userid,
							@RequestParam("name") String name,
							@RequestParam("gender") String gender,
							@RequestParam("city") String city,
							Model model) {
	//Data Commander를 이용하는 방법	
		MemberVO member =new MemberVO(name,userid,gender,city);
		this.memberService.insertMember(member);
		model.addAttribute("code","insert success");
		model.addAttribute("memberInfo",member);
		return "register";
	}
	*/
	/*@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String register(MemberVO memberVO) {
		 //post방식을 사용하면 파라미터의 인코딩 문제가 발생하므로 web.xml에서 filter를 이용해 encoding함
		//data commander객체로 받는방법
		//자동으로 setter호출함
		//jsp에서 1:1매칭될때만 사용할수있음
		this.memberService.insertMember(memberVO);
		return "register";
	}*/
	
	@RequestMapping(value="view/{userid}" ,method=RequestMethod.GET)
	public String view(@PathVariable String userid, Model model) {
		MemberVO memberVO =this.memberService.selectOne(userid);
		model.addAttribute("memberVO", memberVO);
		return "register";
	}
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String register(@ModelAttribute("m")MemberVO memberVO) {
		//Data Commander객체의 이름변경을 위해 사용 memberVO를 m으로 바꿈
		//jsp에서 사용할떄 ${m}으로 사용(노출x)
		this.memberService.insertMember(memberVO);
		//return "register";
		//return "redirect:http://www.naver.com";//절대경로도 가능
		return "redirect:/"; // value = "/"경로로 감 home.jsp호출
	}
	
}
