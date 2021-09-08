package com.example.bookish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookish.model.BookEntity;
import com.example.bookish.model.GenerEntity;
import com.example.bookish.service.BooksService;
import com.example.bookish.service.GenerService;

@RestController
@RequestMapping("bookish")
public class GenerController {
	@Autowired
	GenerService generservice;
	
	@PutMapping("/addGener")
	public String addGener(@RequestBody GenerEntity gener) {
		return generservice.addGener(gener);	
	}

	@GetMapping("/viewGener")
	public List<GenerEntity> viewGener() {
		return generservice.viewGener();
	}
}
