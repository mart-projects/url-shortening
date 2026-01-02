package com.project.url_shortening.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.url_shortening.entity.UrlEntity;

@Repository
public interface UrlRepository extends JpaRepository<UrlEntity, UUID> {

	Optional<UrlEntity> findByShortCode(String shortCode);
	long deleteByShortCode(String shortCode);
}
