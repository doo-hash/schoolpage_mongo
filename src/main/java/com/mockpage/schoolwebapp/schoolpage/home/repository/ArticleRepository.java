package com.mockpage.schoolwebapp.schoolpage.home.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mockpage.schoolwebapp.schoolpage.home.model.SchoolArticles;

public interface ArticleRepository extends MongoRepository<SchoolArticles, Long>{

	@Query("{ 'Id' : ?0 }")
	public  Optional<SchoolArticles> findById(Long Id);
	
}
