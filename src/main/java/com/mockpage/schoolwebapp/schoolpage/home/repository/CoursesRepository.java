package com.mockpage.schoolwebapp.schoolpage.home.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Courses;

public interface CoursesRepository extends MongoRepository<Courses, Long>{	
}
