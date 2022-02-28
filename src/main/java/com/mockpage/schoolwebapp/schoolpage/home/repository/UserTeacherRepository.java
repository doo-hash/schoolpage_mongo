package com.mockpage.schoolwebapp.schoolpage.home.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mockpage.schoolwebapp.schoolpage.home.model.Teacher;

@Repository
public interface UserTeacherRepository extends MongoRepository<Teacher,Long> {

	boolean existsByTeacherId(String teacherid);

	boolean existsByFirstName(String firstName);

	boolean existsByLastName(String lastName);

	boolean existsByEmail(String email);

	@Query("{ 'teacherId' : ?0 }")
	Teacher findByTeacherId(String teacherId);

	@Query("{ 'email' : ?0 }")
	Teacher findByEmail(String email);

	@Query("{ 'lastName' : ?0 }")
	Teacher findByLastName(String lastName);

	@Query("{ 'firstName' : ?0 }")
	Teacher findByFirstName(String firstName);

	@Query(value = "{ 'designation' : ?0 }", fields ="{ 'id' : 1, 'firstname' : 1,'lastname' : 1, 'phonenumber' :1,"
			+" 'email' : 1,"
			+ " 'adminId' : 1, 'password' :1, 'role' :1,"
			+ "'designation' : 1, 'education' : 1, 'work_experience' : 1, 'inactive' : 1, 'deleteadmin' : 1}")
	List<Teacher> findAllByDesignation(String designation);

	Teacher findByPhonenumber(String phonenumber);

}
