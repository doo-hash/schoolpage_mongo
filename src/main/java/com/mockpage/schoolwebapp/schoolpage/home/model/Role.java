package com.mockpage.schoolwebapp.schoolpage.home.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {

	@Transient
	public static final String SEQ_KEY = "role_seq";
	@Id
	private long id;
			
	@Indexed(unique = true,direction = IndexDirection.ASCENDING)
	private String rolename;

	public Role(String rolename) {
		super();
		this.rolename = rolename;
	}


	
	public Role(long id, String rolename) {
		super();
		this.id = id;
		this.rolename = rolename;
	}



	@Override
	public String toString() {
		return "Roles [id=" + id + ", rolename=" + rolename + "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRolename() {
		return rolename;
	}


	public void setRolename(String rolename) {
		this.rolename = rolename;
	}


	public Role() {
		super();
	}


}
