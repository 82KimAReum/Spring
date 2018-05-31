package com.javasoft.bit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/view")
	public String view(Model model) {
		
		model.addAttribute("username", "한지민");
		model.addAttribute("userage", 24);
		model.addAttribute("job", "Developer");
		return "view";
	}
	@RequestMapping("/fruits")
	public String view1(Model model) {
		String [] array = {"Mango", "Banana", "Apple", "Tomato"};
		model.addAttribute("myfruits", array);
		return "fruits";
	}
	@RequestMapping("/view2")
	public ModelAndView view2() {
		ModelAndView mav = new ModelAndView("view2");
		mav.addObject("username", "한지민");
		mav.addObject("currentDate", new java.util.Date());
		return mav;
	}
}
