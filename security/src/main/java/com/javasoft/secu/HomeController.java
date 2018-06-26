package com.javasoft.secu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("greeting", "Hello! Spring Security");
		return "home";
	}
	@RequestMapping("/login.html")
	public String login(Model model) {
		return "login";   //WEB-INF/views/login.jsp
	}
	@RequestMapping("/welcome.html")
	public String welcome(Model model) {
		return "welcome";   //WEB-INF/views/welcome.jsp
	}
}
