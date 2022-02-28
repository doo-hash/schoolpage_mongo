package com.mockpage.schoolwebapp.schoolpage.home.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dbsequence")
public class DbSequences {

	@Id
	private String id;
	private long seq;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}

	
	public DbSequences() {
		super();
	}
	@Override
	public String toString() {
		return "DbSequences [id=" + id + ", seq=" + seq + "]";
	}
	public DbSequences(String id, long seq) {
		super();
		this.id = id;
		this.seq = seq;
	}
	public DbSequences(long seq) {
		super();
		this.seq = seq;
	}
	
}
