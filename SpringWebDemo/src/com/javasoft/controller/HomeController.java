package com.javasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javasoft.vo.UserVO;

@Controller
public class HomeController {
	@Autowired
	private UserVO userVO;
	
	@RequestMapping(value="/home.do" , method=RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("greeting","Good Afternoon!");
		model.addAttribute("username", userVO.getUsername());
		model.addAttribute("userage", userVO.getAge());
		return "home.jsp";
	}
}
