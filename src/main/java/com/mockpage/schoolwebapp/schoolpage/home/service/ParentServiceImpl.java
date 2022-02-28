package com.mockpage.schoolwebapp.schoolpage.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockpage.schoolwebapp.schoolpage.home.model.Parent;
import com.mockpage.schoolwebapp.schoolpage.home.model.Role;
import com.mockpage.schoolwebapp.schoolpage.home.model.SchoolUser;
import com.mockpage.schoolwebapp.schoolpage.home.repository.SchoolUserRepository;
import com.mockpage.schoolwebapp.schoolpage.home.repository.UserParentRepository;

@Service
public class ParentServiceImpl implements IParentService {

	@Autowired
	private UserParentRepository parentRepo;
	@Autowired
	private SchoolUserRepository userRepo;
	@Autowired
	private DbSequenceService seqservice;
	
	/*
	 * public ParentServiceImpl(UserParentRepository parentRepo,
	 * SchoolUserRepository userRepo) { super(); this.parentRepo = parentRepo;
	 * this.userRepo = userRepo; }
	 */

	

	public ParentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	/*
	 * public ParentServiceImpl(UserParentRepository parentRepo,
	 * SchoolUserRepository userRepo, DbSequenceService seqservice) { super();
	 * this.parentRepo = parentRepo; this.userRepo = userRepo; this.seqservice =
	 * seqservice; }
	 */



	@Override
	public List<Parent> findAll() {
		if(parentRepo != null) {
			List<Parent> findAllParents = parentRepo.findAll();
			return findAllParents;
		}
		return null;
	}


	@Override
	public void update(Parent parentupdate) {
		SchoolUser user = userRepo.findByUserid(parentupdate.getParentId());
		Parent parent = parentRepo.findByParentId(parentupdate.getParentId());
		String role = null;
		for (Role role2 : user.getRoles()) {
			role = role2.getRolename();
		}
		if(parent == null) {
			parentupdate.setId(seqservice.getnextseq(Parent.SEQ_KEY));
			parentRepo.save(parentupdate);
		}
		else {
			parent.setFirstName(parentupdate.getFirstName());
			parent.setLastName(parentupdate.getLastName());
			parent.setEmail(parentupdate.getEmail());
			parent.setParentId(parentupdate.getParentId());
			parent.setPhonenumber(parentupdate.getPhonenumber());
			parent.setStudentName(parentupdate.getStudentName());
			parent.setStudentid(parentupdate.getStudentid());
			parent.setPassword(parentupdate.getPassword());
			parent.setRole(role);
			parent.setInactive(parentupdate.isInactive());
			parent.setDelete(parentupdate.isDelete());
			parentRepo.save(parent);
		}
		user.setEmail(parentupdate.getEmail());
		user.setPhonenumber(parentupdate.getPhonenumber());
		user.setDesignation(parentupdate.getStudentid());
		user.setDelete(parentupdate.isDelete());
		user.setInactive(parentupdate.isInactive());
		userRepo.save(user);
	}


	@Override
	public Parent findByParentId(String parentid) {
		Parent parent = parentRepo.findByParentId(parentid);
		return parent;
	}


	@Override
	public Parent findByEmail(String email) {
		Parent parent = parentRepo.findByEmail(email);
		return parent;
	}


	@Override
	public void deleteParent(String parentid) {
		Parent parent = parentRepo.findByParentId(parentid);
		Parent parentbyemail = parentRepo.findByEmail(parentid);
		if(parent  != null) {
			parentRepo.deleteById(parent.getId());
		}
		if(parentbyemail != null) {
			parentRepo.deleteById(parent.getId());
		}	
	}


	@Override
	public Parent save(Parent parent) {
		parent.setId(seqservice.getnextseq(Parent.SEQ_KEY));
		parentRepo.save(parent);
		return parent;
	}
}
