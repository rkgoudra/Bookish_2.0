package com.example.bookish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookish")
public class PingController {

	@GetMapping("/ping")
	public String ping() {
		return "pinged successfully";
	}

}
