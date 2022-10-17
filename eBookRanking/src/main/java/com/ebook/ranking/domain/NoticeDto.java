package com.ebook.ranking.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class NoticeDto {
	private int noticeNo;
	private String noticeWriter;
	private String noticeTitle;
	private String noticeContent;
	private String createDate;
	private int count;
	private String originFile;
	private String storedFile;
	
	//공지 검색
	private String searchType;
	private String searchKeyWord;
	
	//페이징처리
	private int currentPage = 1; //현재페이지 default값은 1
	
	//파일등록
	private List<MultipartFile> noticeFile;
	

}
