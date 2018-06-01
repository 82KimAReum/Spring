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
	
	//1.HttpServletRequest�� �̿��Ѵ�.
	//2.@RequestParam�� �̿��Ѵ�.
	//3.Data Commander��ü(VO)�� �̿��ϴ� ���
	//4.@PathVariable�� �̿��Ѵ�.
	
	/*
	 * @RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(@RequestParam("userid") String userid,
							@RequestParam("name") String name,
							@RequestParam("gender") String gender,
							@RequestParam("city") String city,
							Model model) {
	//Data Commander�� �̿��ϴ� ���	
		MemberVO member =new MemberVO(name,userid,gender,city);
		this.memberService.insertMember(member);
		model.addAttribute("code","insert success");
		model.addAttribute("memberInfo",member);
		return "register";
	}
	*/
	/*@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String register(MemberVO memberVO) {
		 //post����� ����ϸ� �Ķ������ ���ڵ� ������ �߻��ϹǷ� web.xml���� filter�� �̿��� encoding��
		//data commander��ü�� �޴¹��
		//�ڵ����� setterȣ����
		//jsp���� 1:1��Ī�ɶ��� ����Ҽ�����
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
		//Data Commander��ü�� �̸������� ���� ��� memberVO�� m���� �ٲ�
		//jsp���� ����ҋ� ${m}���� ���(����x)
		this.memberService.insertMember(memberVO);
		//return "register";
		//return "redirect:http://www.naver.com";//�����ε� ����
		return "redirect:/"; // value = "/"��η� �� home.jspȣ��
	}
	
}
