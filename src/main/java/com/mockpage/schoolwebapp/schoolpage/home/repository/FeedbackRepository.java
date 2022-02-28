package com.mockpage.schoolwebapp.schoolpage.home.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Feedback;

public interface FeedbackRepository extends MongoRepository<Feedback, Long>{}
