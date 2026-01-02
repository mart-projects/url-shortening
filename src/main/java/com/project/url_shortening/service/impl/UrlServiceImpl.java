package com.project.url_shortening.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.url_shortening.dto.UrlDto;
import com.project.url_shortening.entity.UrlEntity;
import com.project.url_shortening.mapper.UrlMapper;
import com.project.url_shortening.repository.UrlRepository;
import com.project.url_shortening.service.UrlService;

@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	private UrlRepository urlRepository;
	
	@Autowired
	private UrlMapper urlMapper;

	@Override
	public UrlDto saveUrl(UrlDto dto) {
		UrlEntity entity = urlMapper.fromUrlDto(dto);
		entity = urlRepository.save(entity);
		return urlMapper.fromUrlEntity(entity);
	}

	@Override
	public Optional<UrlDto> retrieveOriginal(String shortCode) {
		Optional<UrlEntity> entityOpt = urlRepository.findByShortCode(shortCode);
		if (entityOpt.isPresent()) {
			UrlEntity entity = entityOpt.get();
			entity.setAccessCount(entity.getAccessCount() + 1);
			
			entity = urlRepository.save(entity);
			return Optional.of(urlMapper.fromUrlEntity(entity));
		}
		else return Optional.empty();
	}

	@Override
	public UrlDto updateUrl(UrlDto dto) {
		UrlEntity entity = urlMapper.fromUrlDto(dto);
		entity = urlRepository.save(entity);
		return urlMapper.fromUrlEntity(entity);
	}

	@Override
	public boolean deleteUrl(String shortCode) {
		long deleteCount = urlRepository.deleteByShortCode(shortCode);
		if (deleteCount > 0) return true;
		else return false;
	}

	@Override
	public Optional<UrlDto> getStatistic(String shortCode) {
		Optional<UrlEntity> entity = urlRepository.findByShortCode(shortCode);
		if (entity.isPresent()) {
			return Optional.of(urlMapper.fromUrlEntity(entity.get()));
		}
		return Optional.empty();
	}
	
	
}
