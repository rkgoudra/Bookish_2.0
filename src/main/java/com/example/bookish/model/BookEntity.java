package com.example.bookish.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "books")
@Data
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "book_name")
	private String book_name;

	@Column(name = "book_author")
	private String book_author;

	@Column(name="receiver_name")
	private String receiver_name;

	@Column(name="expected_return_date")
	private Date expected_return_date;

	@Column(name="language")
	private String language;

	@Column(name="gener_id")
	private Integer gener_id;

	@Column(name="status")
	private Integer status;

	@Column(name="description")
	private String description;

	@Column(name="user_id")
	private Integer user_id;

	@Column(name="delet_status")
	private Integer delet_status;

	@Column(name="isbn")
	private Integer isbn;
}
