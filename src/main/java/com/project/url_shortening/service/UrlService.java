package com.project.url_shortening.service;

import java.util.Optional;

import com.project.url_shortening.dto.UrlDto;

public interface UrlService {

	public UrlDto saveUrl(UrlDto dto);
	public Optional<UrlDto> retrieveOriginal(String shortCode);
	public UrlDto updateUrl(UrlDto dto);
	public boolean deleteUrl(String shortCode);
	public Optional<UrlDto> getStatistic(String shortCode);
}
