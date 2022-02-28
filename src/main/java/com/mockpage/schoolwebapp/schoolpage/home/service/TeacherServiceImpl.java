package com.mockpage.schoolwebapp.schoolpage.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockpage.schoolwebapp.schoolpage.home.model.Role;
import com.mockpage.schoolwebapp.schoolpage.home.model.SchoolUser;
import com.mockpage.schoolwebapp.schoolpage.home.model.Teacher;
import com.mockpage.schoolwebapp.schoolpage.home.repository.SchoolUserRepository;
import com.mockpage.schoolwebapp.schoolpage.home.repository.UserTeacherRepository;

@Service
public class TeacherServiceImpl implements ITeacherService {

	@Autowired
	private UserTeacherRepository teacherRepo;
	@Autowired
	private SchoolUserRepository userRepo;
	@Autowired
	private DbSequenceService seqservice;
	
	/*
	 * public TeacherServiceImpl(UserTeacherRepository teacherRepo,
	 * SchoolUserRepository userRepo,DbSequenceService seqservice) { super();
	 * this.teacherRepo = teacherRepo; this.userRepo = userRepo; this.seqservice =
	 * seqservice; }
	 */


	public TeacherServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<Teacher> findAll() {
		
		if(teacherRepo != null) {
			List<Teacher> findAllTeachers = teacherRepo.findAll();		
			return findAllTeachers;
		}
		return null;
	}


	@Override
	public void update(Teacher teacherupdate) {
		
		SchoolUser user = userRepo.findByUserid(teacherupdate.getTeacherId());
		Teacher teacher = teacherRepo.findByTeacherId(teacherupdate.getTeacherId());
		String role = null;
		for (Role role2 : user.getRoles()) {
			role = role2.getRolename();
		}
		
		if(teacher == null) {
			teacherupdate.setId(seqservice.getnextseq(Teacher.SEQ_KEY));
			teacherRepo.save(teacherupdate);
		}
		else {	
			teacher.setFirstName(teacherupdate.getFirstName());
			teacher.setLastName(teacherupdate.getLastName());
			teacher.setPhonenumber(teacherupdate.getPhonenumber());
			teacher.setEmail(teacherupdate.getEmail());
			teacher.setTeacherId(teacherupdate.getTeacherId());
			teacher.setPassword(teacherupdate.getPassword());
			teacher.setRole(role);
			teacher.setDesignation(teacherupdate.getDesignation());
			teacher.setEducation(teacherupdate.getEducation());
			teacher.setWork_experience(teacherupdate.getWork_experience());
			teacher.setDelete(teacherupdate.isDelete());
			teacher.setInactive(teacherupdate.isInactive());
			teacherRepo.save(teacher);
		}
		user.setEmail(teacherupdate.getEmail());
		user.setPhonenumber(teacherupdate.getPhonenumber());
		user.setDesignation(teacherupdate.getDesignation());
		user.setDelete(teacherupdate.isDelete());
		user.setInactive(teacherupdate.isInactive());
		userRepo.save(user);
		}


	@Override
	public Teacher findByEmail(String email) {
		Teacher teacher = teacherRepo.findByEmail(email);
		return teacher;
	}


	@Override
	public Teacher findByTeacherId(String teacherid) {
		Teacher teacher = teacherRepo.findByTeacherId(teacherid);
		return teacher;
	}


	@Override
	public void deleteTeacher(String teacherid) {
		Teacher teacher = teacherRepo.findByTeacherId(teacherid);
		Teacher teacheremail = teacherRepo.findByEmail(teacherid);
		
		if(teacher != null) {
			teacherRepo.deleteById(teacher.getId());
		}
		if(teacheremail != null) {
			teacherRepo.deleteById(teacheremail.getId());
		}
	}


	@Override
	public int usercount() {
		int count = 0;
		List<Teacher> allusers = teacherRepo.findAll();
		for (Teacher teacher : allusers) {
			if(teacher != null) {
				count += 1;
			}
		}
		return count;
	}


	@Override
	public Teacher save(Teacher teacher) {
		teacher.setId(seqservice.getnextseq(Teacher.SEQ_KEY));
		teacherRepo.save(teacher);
		return teacher;
	}

}
