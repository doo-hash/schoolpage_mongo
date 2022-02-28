package com.mockpage.schoolwebapp.schoolpage.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockpage.schoolwebapp.schoolpage.home.model.GuestUser;
import com.mockpage.schoolwebapp.schoolpage.home.model.Role;
import com.mockpage.schoolwebapp.schoolpage.home.model.SchoolUser;
import com.mockpage.schoolwebapp.schoolpage.home.repository.GuestUserRepository;
import com.mockpage.schoolwebapp.schoolpage.home.repository.SchoolUserRepository;

@Service
public class GuestUserServiceImpl implements IGuestUserService {

	@Autowired
	private GuestUserRepository guestuserRepo;
	@Autowired
	private SchoolUserRepository userRepo;
	@Autowired
	private DbSequenceService seqservice;
	
	/*
	 * public GuestUserServiceImpl(GuestUserRepository guestuserRepo,
	 * SchoolUserRepository userRepo) { super(); this.guestuserRepo = guestuserRepo;
	 * this.userRepo = userRepo; }
	 */

	

	public GuestUserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	/*
	 * public GuestUserServiceImpl(GuestUserRepository guestuserRepo,
	 * SchoolUserRepository userRepo, DbSequenceService seqservice) { super();
	 * this.guestuserRepo = guestuserRepo; this.userRepo = userRepo; this.seqservice
	 * = seqservice; }
	 */



	@Override
	public List<GuestUser> findAll() {
		if(guestuserRepo != null) {
			List<GuestUser> findAllGuestUsers = guestuserRepo.findAll();
			return findAllGuestUsers;
		}
		return null;
	}


	@Override
	public void update(GuestUser guestuserupdate) {
		SchoolUser user = userRepo.findByUserid(guestuserupdate.getUserId());
		GuestUser guestuser = guestuserRepo.findByUserId(guestuserupdate.getUserId());
		String role = null;
		for (Role role2 : user.getRoles()) {
			role = role2.getRolename();
		}
		if(guestuser == null) {
			guestuserupdate.setId(seqservice.getnextseq(GuestUser.SEQ_KEY));
			guestuserRepo.save(guestuserupdate);
		}
		else {
			guestuser.setFirstName(guestuserupdate.getFirstName());
			guestuser.setLastName(guestuserupdate.getLastName());
			guestuser.setEmail(guestuserupdate.getEmail());
			guestuser.setPhonenumber(guestuserupdate.getPhonenumber());
			guestuser.setUserId(guestuserupdate.getUserId());
			guestuser.setProfession(guestuserupdate.getProfession());
			guestuser.setEducation(guestuserupdate.getEducation());
			guestuser.setDescription(guestuserupdate.getDescription());
			guestuser.setDelete(guestuserupdate.isDelete());
			guestuser.setInactive(guestuserupdate.isInactive());
			guestuser.setRole(role);
			guestuserRepo.save(guestuser);
		}
		
		user.setDesignation(guestuserupdate.getProfession());
		user.setEmail(guestuserupdate.getEmail());
		user.setPhonenumber(guestuserupdate.getPhonenumber());
		user.setDelete(guestuserupdate.isDelete());
		user.setInactive(guestuserupdate.isInactive());
		userRepo.save(user);
	}


	@Override
	public GuestUser findByUserId(String userid) {
		GuestUser user = guestuserRepo.findByUserId(userid);
		return user;
	}


	@Override
	public GuestUser findByEmail(String email) {
		GuestUser user = guestuserRepo.findByEmail(email);
		return user;
	}


	@Override
	public void deleteGuestUser(String userid) {
		GuestUser user = guestuserRepo.findByUserId(userid);
		GuestUser userbyemail = guestuserRepo.findByEmail(userid);
		
		if(user != null) {
			guestuserRepo.deleteById(user.getId());
		}
		if(userbyemail != null) {
			guestuserRepo.deleteById(userbyemail.getId());
		}
	}


	@Override
	public GuestUser save(GuestUser guestUser) {
		guestUser.setId(seqservice.getnextseq(GuestUser.SEQ_KEY));
		guestuserRepo.save(guestUser);
		return guestUser;
	}

}
