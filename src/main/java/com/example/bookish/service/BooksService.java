package com.example.bookish.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookish.model.BookEntity;
import com.example.bookish.repository.BookRepository;

@Service
@Transactional
public class BooksService {

	@Autowired
	BookRepository bookRepository;
	
	public String addBooks(BookEntity books) {
		try {
		if(books.getBook_id()!=null) {
			BookEntity bookentity=bookRepository.findById(books.getBook_id()).orElse(null);
			if(bookentity!=null) {
				bookentity.setBook_author(books.getBook_author());
				bookentity.setBook_name(books.getBook_name());
				bookRepository.save(bookentity);
				
			}
			return "Book updated successfully.";
		}
		else {
		bookRepository.save(books);
		return "Book added successfully";
		}
		
		}catch (Exception e) {
			return "error while saving"+e;	
		}
		
	}
	
	public String deleteBooks(BookEntity books) {
		try {
		if(books.getBook_id()!=null) {
			bookRepository.deleteById(books.getBook_id());
		}
		return "Book Deleted successfully";
		}catch(Exception e) {
			return "error while Deleting"+e;	
		}
		
	}
	
	public List<BookEntity> viewBooks() {
		try {
			return bookRepository.findAll();
		}catch(Exception e) {
			System.out.println("error while Fetching"+e);
		}
		return null;
	}
}
