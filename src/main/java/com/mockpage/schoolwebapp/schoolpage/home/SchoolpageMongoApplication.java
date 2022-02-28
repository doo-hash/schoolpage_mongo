package com.mockpage.schoolwebapp.schoolpage.home;


import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mockpage.schoolwebapp.schoolpage.home.model.Admissions;
import com.mockpage.schoolwebapp.schoolpage.home.model.Courses;
import com.mockpage.schoolwebapp.schoolpage.home.model.Role;
import com.mockpage.schoolwebapp.schoolpage.home.model.Student;
import com.mockpage.schoolwebapp.schoolpage.home.repository.AdmissionsRepository;
import com.mockpage.schoolwebapp.schoolpage.home.repository.CoursesRepository;
import com.mockpage.schoolwebapp.schoolpage.home.repository.RoleRepository;
import com.mockpage.schoolwebapp.schoolpage.home.repository.StudentRepository;
import com.mockpage.schoolwebapp.schoolpage.home.service.DbSequenceService;

@SpringBootApplication
public class SchoolpageMongoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SchoolpageMongoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SchoolpageMongoApplication.class, args);
	}
	
	@Bean
	  public CommandLineRunner demo(AdmissionsRepository admissionsrepo,CoursesRepository coursesrepo,
			  StudentRepository studentRepo,
			  RoleRepository roleRepo,DbSequenceService seqservice) {
	    return (args) -> {			
			/*
			 * studentRepo.save(new Student(seqservice.getnextseq(Student.SEQ_KEY),"Sagar",
			 * "Govindam","Shekhar Govindam","184-789-4758","11001","X","A"));
			 * studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Sireesha",
			 * "GGGGGG","Shankar GGGGG","184-789-4751","11002","IX","E"));
			 * studentRepo.save(new Student(seqservice.getnextseq(Student.SEQ_KEY),"Austin",
			 * "Waston","Anil Waston","184-789-4752","11003","VIII","A"));
			 * studentRepo.save(new Student(seqservice.getnextseq(Student.SEQ_KEY),"John",
			 * "Augestin","David Augestin","184-789-4753","11004","XI","E"));
			 * studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Sherlock",
			 * "Homes","Anny Homes","184-789-4754","11005","XII","F")); studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Dave",
			 * "Vaticon","Saketh Vaticon","184-789-4755","11006","VI","D"));
			 * studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Roja","Reddy","Shikhar Reddy"
			 * ,"184-789-4756","11007","VII","C")); studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Xavier",
			 * "Williams","Xor Williams","184-789-4757","11008","VI","A"));
			 * studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Jack","Watson","Jill Watson"
			 * ,"184-789-4759","11009","VII","B")); studentRepo.save(new
			 * Student(seqservice.getnextseq(Student.SEQ_KEY),"Johnathen","Rath","Rock Rath"
			 * ,"184-789-4750","11010","IX","A"));
			 */
			/*
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Languages","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Science","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Mathematics","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse ("2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Arts","John",LocalDate.
			 * parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Chemistry","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Social","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"English","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Physics","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 * admissionsrepo.save(new
			 * Admissions(seqservice.getnextseq(Admissions.SEQ_KEY),"Biology","John",
			 * LocalDate.parse("2022-01-05"),LocalDate.parse( "2023-01-03"),200,100,100));
			 */
			  
			  
			
			/*
			 * coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 1,"Languages",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 2,"Science",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 3,"Mathematics",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long) 4,"Arts",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 5,"Chemistry",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 6,"Social",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 7,"English",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 8,"Physics",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * )); coursesrepo.save(new
			 * Courses(seqservice.getnextseq(Courses.SEQ_KEY),"course-1",10,(long)
			 * 9,"Biology",
			 * "Jackson","Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing. Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS. Loremipsum dolor sit amet consectetur adipisicing elit Vel accusantium impediS."
			 * ));
			 * 
			 * 
			 * roleRepo.save(new Role(seqservice.getnextseq(Role.SEQ_KEY),"ADMIN"));
			 * roleRepo.save(new Role(seqservice.getnextseq(Role.SEQ_KEY),"TEACHER"));
			 * roleRepo.save(new
			 * Role(seqservice.getnextseq(Role.SEQ_KEY),"PARENT"));roleRepo.save(new
			 * Role(seqservice.getnextseq(Role.SEQ_KEY),"USER"));
			 */
	      log.info("Admissions and Courses are added.");
	    };
	  }

}

