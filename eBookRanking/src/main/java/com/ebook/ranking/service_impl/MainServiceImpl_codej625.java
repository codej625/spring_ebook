package com.ebook.ranking.service_impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.ranking.mapper.MainMapper_codej625;

@Service
public class MainServiceImpl_codej625 implements com.ebook.ranking.service.MainService_codej625 {

	@Autowired
	MainMapper_codej625 codej625;

	@Override
	public Map<String, Object> testService() throws Exception {

		return codej625.test();
	}

}
