package com.ebook.ranking.main_controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ebook.ranking.domain.NoticeDto;
import com.ebook.ranking.service.NoticeService_devho321;


@Controller
public class NoticeController_devho321 {
	
	@Autowired
	NoticeService_devho321 ns;
	
	@GetMapping(value = "/devho321/noitceForm")
	public ModelAndView noitceForm(ModelAndView mv) throws Exception {
		
		List<NoticeDto> noticeList = ns.selectNoticeList();
		
		System.out.println(noticeList);
		
		mv.addObject("noticeList",noticeList);
		mv.setViewName("devho321/noticeForm");
		
		return mv;
	}
	
	@GetMapping(value = "/devho321/insertNoticeForm")
	public ModelAndView noitceInsert(ModelAndView mv) throws Exception {
		
		mv.setViewName("devho321/insertNoticeForm");
		
		return mv;
	}
	
	@PostMapping(value = "/devho321/insertNotice")
	public void noitceInsert(ModelAndView mv, NoticeDto noticeDto) throws Exception {
		
		System.out.println("gfggg =>" + noticeDto.getNoticeTitle());
	}
}
