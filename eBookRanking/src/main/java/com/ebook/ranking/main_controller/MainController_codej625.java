package com.ebook.ranking.main_controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ebook.ranking.service_impl.MainServiceImpl_codej625;

@Controller
public class MainController_codej625 {

	@Autowired
	MainServiceImpl_codej625 codej625;

	@GetMapping(value = "/")
	public String testController(Model model) throws Exception {

		Map<String, Object> test = codej625.testService();
		model.addAttribute("test", test);

		return "test";
	}

}
