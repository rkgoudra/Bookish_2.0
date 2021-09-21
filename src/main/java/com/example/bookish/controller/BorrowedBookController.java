package com.example.bookish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookish.model.BorrowedBookEntity;
import com.example.bookish.service.BorrowedBookService;

@RestController
@RequestMapping("bookish")
public class BorrowedBookController {
	
	@Autowired
	BorrowedBookService borrowedbookservice;
	@PutMapping("/addBorrowedBooks")
	public String addBooks(@RequestBody BorrowedBookEntity borrowedbooks) {
		return borrowedbookservice.addBorrowedBooks(borrowedbooks);	
	}
	@GetMapping("/viewBorrowedBooks")
	public List<BorrowedBookEntity> viewBorrowedBooks() {
		return borrowedbookservice.viewBorrowedBooks();
	}

}
