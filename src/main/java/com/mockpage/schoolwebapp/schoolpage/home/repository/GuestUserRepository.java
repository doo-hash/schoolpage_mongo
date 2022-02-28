package com.mockpage.schoolwebapp.schoolpage.home.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.GuestUser;

@Repository
public interface GuestUserRepository extends MongoRepository<GuestUser,Long> {

//	@Query("{ 'userId' : ?0 }")
	boolean existsByUserId(String userId);

//	@Query("{ 'firstName' : ?0 }")
	boolean existsByFirstName(String firstName);

//	@Query("{ 'lastName' : ?0 }")
	boolean existsByLastName(String lastName);

//	@Query("{ 'email' : ?0 }") not working aopinvocationException - datatype do not match
	boolean existsByEmail(String email);

	@Query("{ 'userId' : ?0 }")
	GuestUser findByUserId(String userId);

	@Query("{ 'email' : ?0 }")
	GuestUser findByEmail(String email);

	@Query("{ 'lastName' : ?0 }")
	GuestUser findByLastName(String lastName);

	@Query("{ 'firstName' : ?0 }")
	GuestUser findByFirstName(String firstName);
	
	@Query("{ 'phonenumber' : ?0 }")
	GuestUser findByPhonenumber(String phonenumber);

}
