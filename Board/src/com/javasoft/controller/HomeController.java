package com.javasoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javasoft.service.BoardService;
import com.javasoft.vo.BoardVO;

@Controller
public class HomeController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board",method=RequestMethod.GET)
	@ResponseBody
	public Map select() {
		Map<String, Object>result=new HashMap<String , Object>();
		List<BoardVO> list=this.boardService.select();
		result.put("code", Boolean.TRUE);
		result.put("data", list);
		return result;
	}
	
	@RequestMapping(value="/board",method=RequestMethod.POST)
	@ResponseBody
	public Map insert(@RequestBody BoardVO board) {
		//System.out.println(board);
		Map<String,Object> result= new HashMap<String,Object>();
		this.boardService.insertBoard(board);
		result.put("code", Boolean.TRUE);
		return result;
	}
	
	@RequestMapping(value="/board/{idx}",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView select(@PathVariable int idx) {
		//Map<String,Object> result= new HashMap<String,Object>();
		BoardVO board=this.boardService.selectBoard(idx);
		String contents=board.getContents();
		contents=contents.replaceAll("\n", "<br/>");
		board.setContents(contents);
		//result.put("code", Boolean.TRUE);
		//result.put("data", board);
		ModelAndView mav = new ModelAndView();
		mav.addObject("code", Boolean.TRUE);
		mav.addObject("data",board);
		mav.setViewName("view");//  /WEB-INF/html/view.jsp을 찾음
		return mav;
	}
	@RequestMapping(value="/board/write",method=RequestMethod.GET)
	public String write() {
		return "write";  //   /WEB-INF/html/write.jsp을 찾음
	}
	
	@RequestMapping(value="/board/{idx}" , method=RequestMethod.DELETE)
	@ResponseBody
	public Map delete(@PathVariable int idx) {
		this.boardService.deleteBoard(idx);
		Map<String,Object>result=new HashMap<>();
		result.put("code", Boolean.TRUE);
		return result;
	}
	@RequestMapping(value="/board" , method=RequestMethod.PUT)
	@ResponseBody
	public Map update(@RequestBody BoardVO board) {
		this.boardService.updateBoard(board);
		Map<String,Object>result=new HashMap<>();
		result.put("code", Boolean.TRUE);
		return result;
	}
	@RequestMapping(value="/board/answer/{idx}")
	public ModelAndView answer_view(@PathVariable int idx) {// /WEB-INF/html/answer.jsp
		ModelAndView mav= new ModelAndView();
		mav.addObject("idx", idx);
		mav.setViewName("answer");
		return mav;
	}
}
