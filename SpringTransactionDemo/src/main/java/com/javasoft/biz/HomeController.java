package com.javasoft.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@Autowired
	private TicketDao ticketDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("greeting", "Hello, Spring Transaction");
		return "home";
	}
	@RequestMapping("/buy_ticket")
	public String buy_ticket() {
		return "buy_ticket";
	}
	
	@RequestMapping(value = "/buy_ticket_card", method = RequestMethod.POST)
	public String buy_ticket_card(TicketVO ticketVO, Model model) {
		System.out.println( "buy_ticket_card" );
		System.out.println( "ConsumerId: " + ticketVO.getConsumerId() );
		System.out.println( "Amount : " + ticketVO.getAmount() );
	
		this.ticketDao.buyTicket(ticketVO);
	
		model.addAttribute("ticketInfo", ticketVO);
	
		return "buy_ticket_result";
	}
}
