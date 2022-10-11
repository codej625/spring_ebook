package com.ebook.ranking.main_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ebook.ranking.service.MainService_devho321;

@Controller
public class MainController_devho321 {
	
	@Autowired
	MainService_devho321 ms321;
	
	@GetMapping(value = "/devho321/main")
	public ModelAndView mainController(ModelAndView mv) {
		
		mv.setViewName("devho321/main");
		
		return mv;
	}
	
}
