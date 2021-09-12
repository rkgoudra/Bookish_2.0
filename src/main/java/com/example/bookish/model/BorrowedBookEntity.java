package com.example.bookish.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "borrowedbooks")
public class BorrowedBookEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer borrowed_books_id;
	
	@Column(name="book_id")
	private Integer book_id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="borrow_from")
	private String borrow_from;
	
	@Column(name="phone_no")
	private Integer phone_no;
	
	@Column(name="book_return_status")
	private String book_return_status;
	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}

	public Integer getBook_id() {
		return book_id;
	}

	public Integer getBorrowed_books_id() {
		return borrowed_books_id;
	}

	public void setBorrowed_books_id(Integer borrowed_books_id) {
		this.borrowed_books_id = borrowed_books_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBorrow_from() {
		return borrow_from;
	}

	public void setBorrow_from(String borrow_from) {
		this.borrow_from = borrow_from;
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

	@Column(name="due_date")
	private Date due_date;
	
	@Column(name="user_id")
	private Integer user_id;

}
