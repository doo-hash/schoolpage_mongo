package com.mockpage.schoolwebapp.schoolpage.home.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Admin;

@Repository
public interface UserAdminRepository extends MongoRepository<Admin,Long> {

	boolean existsByAdminId(String adminId);

	boolean existsByFirstName(String firstName);

	boolean existsByLastName(String lastName);

	@Query("{ 'adminId' : ?0 }")
	Admin findByAdminId(String adminId);

	@Query("{ 'lastname' : ?0 }")
	Admin findByEmail(String email);

	@Query("{ 'lastname' : ?0 }")
	Admin findByLastName(String lastName);

	@Query("{ 'firstname' : ?0 }")
	Admin findByFirstName(String firstName);

	@Query(value = "{ 'designation' : ?0 }", fields ="{ 'id' : 1, 'firstname' : 1,'lastname' : 1, 'phonenumber' :1,"
			+" 'email' : 1,"
			+ " 'adminId' : 1, 'password' :1, 'role' :1,"
			+ "'designation' : 1, 'education' : 1, 'work_experience' : 1, 'inactive' : 1, 'deleteadmin' : 1}")
	List<Admin> findAllByDesignation(String designation);

	@Query("{ 'phonenumber' : ?0 }")
	Admin findByPhonenumber(String phonenumber);

}
