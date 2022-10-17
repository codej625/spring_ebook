package com.ebook.ranking.main_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ebook.ranking.domain.NoticeDto;
import com.ebook.ranking.service.NoticeService_devho321;



@Controller
public class NoticeController_devho321 {
	
	@Autowired
	NoticeService_devho321 ns;
	
	//공지사항 조회
	@RequestMapping(value = "/noitceList", method = {RequestMethod.GET, RequestMethod.POST})
	public String noitceList(NoticeDto noticeDto) throws Exception {
		
		int totalCnt = ns.selectTotalCnt();
		List<NoticeDto> noticeList = ns.selectNoticeList(noticeDto);
		
		System.out.println("totalCnt => " + totalCnt);
		System.out.println(noticeList);
		
		return "redirect:/";
	}
	
	//공지사항 상세조회
	@GetMapping(value = "/noticeList/{noticeNo}")
	public String noticeDetail(@PathVariable("noticeNo") int noticeNo) throws Exception{
		System.out.println("noticeNo ==> " + noticeNo);
		List<NoticeDto> noticeDetail = ns.selectNoticeDetailList(noticeNo); 
		System.out.println(noticeDetail);
		return "redirect:/";
	}
	//공지사항 등록 (admin계정만 사용가능)
	@PostMapping(value = "/noticeInsert")
	public String noitceInsert(@ModelAttribute NoticeDto noticeDto) throws Exception {
		
		ns.insertNotice(noticeDto);
		
		return "redirect:/";		
	}
	//공지사항 수정 (admin계정만 사용가능)
	@PostMapping(value = "/noitceUpdate")
	public void noitceUpdate(ModelAndView mv, NoticeDto noticeDto) throws Exception {
		
	}
	//공지사항 삭제(admin계정만 사용가능)
	@PostMapping(value = "/noitceDelete")
	public void noitceDelete(ModelAndView mv, NoticeDto noticeDto) throws Exception {
		
	}
}
