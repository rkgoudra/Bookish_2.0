package com.example.bookish.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
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
	 	
		public String getReceiver_name() {
			return receiver_name;
		}
		public void setReceiver_name(String receiver_name) {
			this.receiver_name = receiver_name;
		}
		public Date getExpected_return_date() {
			return expected_return_date;
		}
		public void setExpected_return_date(Date expected_return_date) {
			this.expected_return_date = expected_return_date;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getBook_author() {
			return book_author;
		}
		public void setBook_author(String book_author) {
			this.book_author = book_author;
		}
	     
}
