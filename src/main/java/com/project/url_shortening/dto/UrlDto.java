package com.project.url_shortening.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UrlDto {

	private UUID uuid;
	private String url;
	private String shortCode;
	private String createdAt;
	private String updatedAt;
	private int accessCount;
	
}
