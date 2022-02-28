package com.mockpage.schoolwebapp.schoolpage.home.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Admissions;

@Repository
public interface AdmissionsRepository extends MongoRepository<Admissions, Long>{
}
