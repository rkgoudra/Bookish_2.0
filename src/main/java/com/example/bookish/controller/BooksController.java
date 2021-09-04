package com.example.bookish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookish.model.BookEntity;
import com.example.bookish.service.BooksService;

@RestController
@RequestMapping("bookish")
public class BooksController {

	@Autowired
	BooksService booksService;

	@PutMapping("/addBooks")
	public String addBooks(@RequestBody BookEntity books) {
		return booksService.addBooks(books);	
	}

}
