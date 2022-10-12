package com.ebook.ranking.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ebook.ranking.domain.NoticeDto;

@Mapper
@Repository
public interface NoticeMapper_devho321 {

	List<NoticeDto> selectNoticeList(NoticeDto noticeDto) throws Exception;

	int selectTotalCnt() throws Exception;

	List<NoticeDto> selectNoticeDetailList(int noticeNo) throws Exception;

}
