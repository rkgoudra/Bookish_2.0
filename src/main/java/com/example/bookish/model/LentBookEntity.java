package com.example.bookish.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lentbook")
public class LentBookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="book_id")
	private Integer book_id;

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

}
