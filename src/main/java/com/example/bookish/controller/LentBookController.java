package com.example.bookish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookish.model.LentBookEntity;
import com.example.bookish.service.LentBookService;

@RestController
@RequestMapping("bookish")
public class LentBookController {
	@Autowired
	LentBookService lentbookservice;
	@PutMapping("/addLentBook")
	public String addLentBook(@RequestBody LentBookEntity lentbook) {
		return lentbookservice.addLentBook(lentbook);
		
	}
	@GetMapping("/viewLentBook")
	public List<LentBookEntity> viewLentBook() {
		return lentbookservice.viewLentBook();
	}

}
