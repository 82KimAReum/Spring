package com.javasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javasoft.service.EmployeeService;
import com.javasoft.vo.EmployeeVO;

@Controller
public class HomeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/home.nhn",method=RequestMethod.GET)
	public String home(Model model) {
		List<EmployeeVO> list =this.employeeService.select();
		model.addAttribute("emplist", list);
		return "home.jsp";
	}
}
