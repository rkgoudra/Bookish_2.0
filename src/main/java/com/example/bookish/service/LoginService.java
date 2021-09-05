package com.example.bookish.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookish.model.LoginEntity;
import com.example.bookish.repository.LoginRepository;


@Service
@Transactional
public class LoginService {
	@Autowired
	LoginRepository loginrepository;
	
	public String addLogin(LoginEntity login) {
		try {
			loginrepository.save(login);
			return "User added successfully";
		}catch(Exception e) {
			return "error while saving"+e;
			
		}
		
		
	}

}
