package com.project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.dto.UserDto;
import com.project.backend.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/user")
	public ResponseEntity<?> CreateUser(@RequestBody UserDto user){
		boolean saved = userService.addUser(user);
		return new ResponseEntity<>((saved == true) ? "user saved successfully" : "not successfull",
				(saved== true) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
		
	}
	
	
}