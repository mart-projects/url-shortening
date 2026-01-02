package com.project.url_shortening.entity;

import com.project.url_shortening.util.RandomUtil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UrlEntity extends BaseEntity {

	@Column(name = "url", nullable = false)
	private String url;
	
	@Column(name = "short_code", unique = true, nullable = false)
	private String shortCode;
	
	@Column(name = "access_count", nullable = false)
	private int accessCount;
	
	public UrlEntity(String url) {
		this.accessCount = 0;
		this.shortCode = RandomUtil.generateWithCommonsText(10);
	}
}
