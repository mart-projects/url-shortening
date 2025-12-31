package com.project.url_shortening.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.url_shortening.dto.UrlDto;
import com.project.url_shortening.repository.UrlRepository;
import com.project.url_shortening.service.UrlService;

@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	private UrlRepository urlRepository;

	@Override
	public boolean saveUrl(UrlDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UrlDto retrieveOriginal(String shortCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UrlDto updateUrl(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUrl(String shortCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UrlDto getStatistic(String shortCode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
