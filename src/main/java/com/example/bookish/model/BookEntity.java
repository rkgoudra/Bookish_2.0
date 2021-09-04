package com.example.bookish.model;

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
