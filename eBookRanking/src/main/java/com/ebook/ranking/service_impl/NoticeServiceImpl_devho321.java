package com.ebook.ranking.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.ranking.domain.NoticeDto;
import com.ebook.ranking.mapper.NoticeMapper_devho321;
import com.ebook.ranking.service.NoticeService_devho321;

@Service
public class NoticeServiceImpl_devho321 implements NoticeService_devho321 {

	@Autowired
	NoticeMapper_devho321 nm;
	
	@Override
	public List<NoticeDto> selectNoticeList(NoticeDto noticeDto) throws Exception {
		
		return nm.selectNoticeList(noticeDto);
	}

	@Override
	public int selectTotalCnt() throws Exception {
		// TODO Auto-generated method stub
		return nm.selectTotalCnt();
	}

	@Override
	public List<NoticeDto> selectNoticeDetailList(int noticeNo) throws Exception {
		// TODO Auto-generated method stub
		return nm.selectNoticeDetailList(noticeNo);
	}

}
