package com.mockpage.schoolwebapp.schoolpage.home.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Long> {

	boolean existsByStudentId(String studentId);

	@Query("{ 'studentId' : ?0 }")
	Student findByStudentId(String studentId);
}
