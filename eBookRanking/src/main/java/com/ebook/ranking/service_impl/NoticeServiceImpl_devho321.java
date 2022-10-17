package com.ebook.ranking.service_impl;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
		
		return nm.selectTotalCnt();
	}

	@Override
	public List<NoticeDto> selectNoticeDetailList(int noticeNo) throws Exception {
	
		return nm.selectNoticeDetailList(noticeNo);
	}

	@Override
	public void insertNotice(NoticeDto noticeDto) throws Exception {
		
		for(MultipartFile multiPartFile : noticeDto.getNoticeFile()) {
			//첨부파일 포함 공지사항 등록
			if(!multiPartFile.getOriginalFilename().equals("") && multiPartFile.getOriginalFilename() != null) {
				//청부파일 이름
			    String orgFilename = multiPartFile.getOriginalFilename();
			    //청부파일 확장자
			    String orgfileNameExtension = orgFilename.substring(orgFilename.lastIndexOf("."));
			    //uuid값에 orgimagenameExtension(확장자)를 붙혀 저장(= sjf743ifhrht32 + .png)
			    String storedFilename = UUID.randomUUID().toString().replaceAll("-", "") + orgfileNameExtension;
			    //저장경로
			    String savePath = "C:\\Users\\hojoo\\spring_ebook\\eBookRanking\\src\\main\\fileUpload\\";  
			    //파일 저장 경로 + 최종 파일명
			    String uploadFile = savePath + storedFilename;
			    // 업로드요청으로 전달받은 파일을 위에서 설정한 특정 경로에 특정 파일명으로 저장
			    File file = new File(uploadFile);
			    multiPartFile.transferTo(file);
//			    
//			    noticeDto.setOriginFile(orgFilename);
//			    noticeDto.setStoredFile(storedFilename);
//			    
//			    nm.insertNotice(noticeDto);
			}else{
//				nm.insertNotice(noticeDto);
			}
		}
		
	}

}
