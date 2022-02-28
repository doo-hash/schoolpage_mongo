package com.mockpage.schoolwebapp.schoolpage.home.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Parent;

@Repository
public interface UserParentRepository extends MongoRepository<Parent,Long> {

	boolean existsByParentId(String parentId);

	boolean existsByFirstName(String firstName);

	boolean existsByLastName(String lastName);

	boolean existsByEmail(String email);

	@Query("{ 'parentId' : ?0 }")
	Parent findByParentId(String parentId);
	
	@Query("{ 'studentId' : ?0 }")
	Parent findByStudentid(String studentid);

	@Query("{ 'email' : ?0 }")
	Parent findByEmail(String email);

	@Query("{ 'lastName' : ?0 }")
	Parent findByLastName(String lastName);

	@Query("{ 'firstName' : ?0 }")
	Parent findByFirstName(String firstName);

	@Query("{ 'studentName' : ?0 }")
	Parent findByStudentName(String studentName);

	@Query("{ 'phonenumber' : ?0 }")
	Parent findByPhonenumber(String phonenumber);

}
