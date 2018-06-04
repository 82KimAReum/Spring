package com.javasoft.biz;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javasoft.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("greeting","Good Morning");
		return "home";
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		return "register";//register.jsp
	}
	/*@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(UserVO userVO, BindingResult result) {
		//post는 filter에서 한극 처리 해줌
		//BindingResult는 검증할때 사용
		MyValidator validator=new MyValidator();
		validator.validate(userVO, result);//에러가 있으면 error가 바인딩
		String page=null;
		if(result.hasErrors()) {
			page="register";
		}else {
			page="result";
		}		
		return page;
	}*/
	@RequestMapping(value="/register",method=RequestMethod.POST)	
	public String register(@Valid UserVO userVO, BindingResult result) {
		String page=null;
		if(result.hasErrors()) {
			page="register";
		}else {
			page="result";
		}
		return page;
	}
	@InitBinder
	protected void  initBinder(WebDataBinder binder) {
		binder.setValidator(new MyValidator());//알아서MyValidator.validator를 호출
	}
}
