package com.example.bookish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookish.model.LoginEntity;
import com.example.bookish.service.LoginService;

@RestController
@RequestMapping("bookish/login")
public class LoginController {
	@Autowired
	LoginService loginservice;
	
	@PutMapping("/createUser")
	public String createUser(@RequestBody LoginEntity login) {
		return loginservice.addLogin(login);	
	}
	
	@PostMapping("/loginUser")
	public LoginEntity getUser(@RequestBody LoginEntity loginData) {
		String email = null;
		String password = null;
		if(loginData.getEmail() != null && loginData.getPassword()!= null) {
			email = loginData.getEmail();
			password = loginData.getPassword();
		}
		return loginservice.getUser(email, password);
	}
	
	

}
