package com.project.url_shortening.service;

import com.project.url_shortening.dto.UrlDto;

public interface UrlService {

	public boolean saveUrl(UrlDto dto);
	public UrlDto retrieveOriginal(String shortCode);
	public UrlDto updateUrl(String url);
	public boolean deleteUrl(String shortCode);
	public UrlDto getStatistic(String shortCode);
}
