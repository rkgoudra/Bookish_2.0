package com.example.bookish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookish.model.LoginEntity;
import com.example.bookish.service.LoginService;

@RestController
@RequestMapping("bookish")
public class LoginController {
	@Autowired
	LoginService loginservice;
	@PutMapping("/addLogin")
	public String addBooks(@RequestBody LoginEntity login) {
		return loginservice.addLogin(login);	
	}

}
