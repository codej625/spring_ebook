package com.ebook.ranking.domain;

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
}
