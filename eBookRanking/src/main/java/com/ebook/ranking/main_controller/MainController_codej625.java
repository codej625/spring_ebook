package com.ebook.ranking.main_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ebook.ranking.service_impl.MainServiceImpl_codej625;

@Controller
public class MainController_codej625 {

	@Autowired
	MainServiceImpl_codej625 codej625;

	@GetMapping(value = "/")
	public ModelAndView testController(ModelAndView mv) throws Exception {

		mv.setViewName("page/test");

		return mv;
	}

}
