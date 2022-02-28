package com.mockpage.schoolwebapp.schoolpage.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockpage.schoolwebapp.schoolpage.home.model.Student;
import com.mockpage.schoolwebapp.schoolpage.home.repository.StudentRepository;

@Service
public class StudentServiceimpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private DbSequenceService seqservice;
	
	/*
	 * public StudentServiceimpl(StudentRepository studentRepo) { super();
	 * this.studentRepo = studentRepo; }
	 */

	
	public StudentServiceimpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	/*
	 * public StudentServiceimpl(StudentRepository studentRepo, DbSequenceService
	 * seqservice) { super(); this.studentRepo = studentRepo; this.seqservice =
	 * seqservice; }
	 */


	@Override
	public List<Student> findAll() {
		if(studentRepo != null) {
			List<Student> allstudents = studentRepo.findAll();
			return allstudents;
		}
		return null;
	}

	@Override
	public int usercount() {
		int count = 0;
		List<Student> allstudents = studentRepo.findAll();
		for (Student student : allstudents) {
			if(student != null) {
				count += 1;
			}
		}
		return count;
	}

	@Override
	public Student save(Student student) {
		if(student != null) {
			student.setId(seqservice.getnextseq(Student.SEQ_KEY));
			studentRepo.save(student);
		}
		return student;
	}

	@Override
	public boolean existsByStudentId(String studentId) {
		
		boolean isstudentid = studentRepo.existsByStudentId(studentId);
		return isstudentid;
	}

	@Override
	public Student findByStudentId(String studentid) {
		Student student = studentRepo.findByStudentId(studentid);
		return student;
	}

	@Override
	public void update(Student studentupdate) {
		Student student = studentRepo.findByStudentId(studentupdate.getStudentId());
		student.setFirstName(studentupdate.getFirstName());
		student.setLastName(studentupdate.getLastName());
		studentRepo.save(student);
	}
	
}
