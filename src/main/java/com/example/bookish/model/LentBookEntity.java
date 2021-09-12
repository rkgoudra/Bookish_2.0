package com.example.bookish.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lentbook")
public class LentBookEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lentbook_id;
	
	@Column(name="book_id")
	private Integer book_id;
	
	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	@Column(name="date")
	private Date date;
	
	@Column(name="lent_to")
	private String lent_to;
	
	@Column(name="phone_no")
	private Integer phone_no;
	
	@Column(name="book_return_status")
	private String book_return_status;
	
	@Column(name="due_date")
	private Date due_date;
	
	@Column(name="user_id")
	private Integer user_id;

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}

	public Date getDate() {
		return date;
	}

	public Integer getLentbook_id() {
		return lentbook_id;
	}

	public void setLentbook_id(Integer lentbook_id) {
		this.lentbook_id = lentbook_id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLent_to() {
		return lent_to;
	}

	public void setLent_to(String lent_to) {
		this.lent_to = lent_to;
	}

	public Integer getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}

	public String getBook_return_status() {
		return book_return_status;
	}

	public void setBook_return_status(String book_return_status) {
		this.book_return_status = book_return_status;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	
}
