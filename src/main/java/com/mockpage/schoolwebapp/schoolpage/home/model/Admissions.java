package com.mockpage.schoolwebapp.schoolpage.home.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admissions")
public class Admissions {

	@Transient
	public static final String SEQ_KEY = "adm_seq";
	@Id
	@Indexed(unique = true)
	private long id;
	private String departments;
	private String faculty;
	private LocalDate start_date;
	private LocalDate end_date;
	private int alloted;
	private int filled;
	private int remaining;
	
	public Admissions() {}
	
	
	public Admissions(long id, String departments, String faculty, LocalDate start_date, LocalDate end_date,
			int alloted, int filled, int remaining) {
		super();
		this.id = id;
		this.departments = departments;
		this.faculty = faculty;
		this.start_date = start_date;
		this.end_date = end_date;
		this.alloted = alloted;
		this.filled = filled;
		this.remaining = remaining;
	}


	public Admissions(String departments, String faculty, LocalDate start_date, LocalDate end_date, int alloted, int filled,
			int remaining) {
		super();
		this.departments = departments;
		this.faculty = faculty;
		this.start_date = start_date;
		this.end_date = end_date;
		this.alloted = alloted;
		this.filled = filled;
		this.remaining = remaining;
	}
	@Override
	public String toString() {
		return "Admissions [id=" + id + ", departments=" + departments + ", faculty=" + faculty + ", start_date="
				+ start_date + ", end_date=" + end_date + ", alloted=" + alloted + ", filled=" + filled + ", remaining="
				+ remaining + "]";
	}
	public long getId() {
		return id;
	}
	public String getDepartments() {
		return departments;
	}
	
	public String getFaculty() {
		return faculty;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public int getAlloted() {
		return alloted;
	}
	public int getFilled() {
		return filled;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public void setAlloted(int alloted) {
		this.alloted = alloted;
	}
	public void setFilled(int filled) {
		this.filled = filled;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	
}
