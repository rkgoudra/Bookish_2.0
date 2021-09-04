package com.example.bookish.service;

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
		bookRepository.save(books);
		return "Book added successfully";
		}catch (Exception e) {
			return "error while saving"+e;	
		}
		
	}
}
