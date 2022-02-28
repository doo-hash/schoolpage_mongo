package com.mockpage.schoolwebapp.schoolpage.home.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.SchoolUser;

@Repository
public interface SchoolUserRepository extends MongoRepository<SchoolUser,Long> {

	boolean existsByUserid(String userid);

	boolean existsByFirstname(String firstname);

	boolean existsByLastname(String lastname);

	boolean existsByEmail(String email);

	@Query("{ 'userid' : ?0 }")
	SchoolUser findByUserid(String userid);

	@Query("{ 'email' : ?0 }")
	SchoolUser findByEmail(String email);

	@Query("{ 'lastname' : ?0 }")
	SchoolUser findByLastname(String lastname);

	@Query("{ 'firstname' : ?0 }")
	SchoolUser findByFirstname(String firstname);

	
	List<SchoolUser> findAllByDesignation(String designation);

	@Query("{ 'phonenumber' : ?0 }")
	SchoolUser findByPhonenumber(String phonenumber);

	boolean existsByDesignation(String designation);

	boolean existsByPhonenumber(String phonenumber);

}
