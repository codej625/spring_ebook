package com.ebook.ranking.service;

import java.util.List;
import java.util.Map;

import com.ebook.ranking.domain.NoticeDto;

public interface NoticeService_devho321 {

	List<NoticeDto> selectNoticeList(NoticeDto noticeDto) throws Exception;

	int selectTotalCnt() throws Exception;

	List<NoticeDto> selectNoticeDetailList(int noticeNo) throws Exception;

	void insertNotice(NoticeDto noticeDto) throws Exception;

}
