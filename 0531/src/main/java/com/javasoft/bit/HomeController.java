package com.javasoft.bit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javasoft.bit.service.MemberService;
import com.javasoft.bit.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	/*public String home(HttpServletRequest req, Model model) {
		try {
			req.setCharacterEncoding("utf-8");
			String name = req.getParameter("name");
			String userid = req.getParameter("userid");
			String gender = req.getParameter("gender");
			String city = req.getParameter("city");
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", name);
			map.put("userid", userid);
			map.put("gender", gender);
			map.put("city", city);
			model.addAttribute("userInfo", map);
		}catch(Exception ex) {}
		return "register";
	}*/
	public String home(@RequestParam("name") String name, 
			@RequestParam("userid") String userid,
			@RequestParam("gender") String gender,
			@RequestParam("city") String city, Model model) {
		/*Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("userid", userid);
		map.put("gender", gender);
		map.put("city", city);*/
		MemberVO member = new MemberVO(name, userid, gender, city);
		int su = this.memberService.insertMember(member);
		String code = null;
		if(su == 1) code = "Insert Success";
		else code = "Insert Failure";
		model.addAttribute("userInfo", member);
		model.addAttribute("code", code);
		return "register";
	}
}
