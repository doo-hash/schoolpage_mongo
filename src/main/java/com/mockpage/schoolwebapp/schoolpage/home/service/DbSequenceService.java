package com.mockpage.schoolwebapp.schoolpage.home.service;

import org.springframework.stereotype.Service;

import com.mockpage.schoolwebapp.schoolpage.home.exceptions.SequenceException;

@Service
public interface DbSequenceService {
 
	public long getnextseq(String key) throws SequenceException;
}
