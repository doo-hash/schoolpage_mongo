package com.mockpage.schoolwebapp.schoolpage.home.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mockpage.schoolwebapp.schoolpage.home.exceptions.SequenceException;
import com.mockpage.schoolwebapp.schoolpage.home.model.DbSequences;

@Service
public class DbSequenceImpl implements DbSequenceService{

	private MongoOperations mongoOperation;
	
	
	public DbSequenceImpl(MongoOperations mongoOperation) {
		super();
		this.mongoOperation = mongoOperation;
	}


	@Override
	public long getnextseq(String key) throws SequenceException {
		Query q= new Query(Criteria.where("_id").is(key));
		Update update = new Update();
		update.inc("seq", 1);
		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true).upsert(true);
		DbSequences seqid = mongoOperation.findAndModify(q, update, options,DbSequences.class);
		
		return !Objects.isNull(seqid) ? seqid.getSeq() : 1;
	}

}
