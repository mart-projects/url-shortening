package com.project.url_shortening.mapper;

import org.mapstruct.Mapper;

import com.project.url_shortening.dto.UrlDto;
import com.project.url_shortening.entity.UrlEntity;

@Mapper(componentModel = "spring")
public interface UrlMapper {

	UrlDto fromUrlEntity(UrlEntity urlEntity);
	UrlEntity fromUrlDto(UrlDto urlDto);
}
