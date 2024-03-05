package com.project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.dto.LoginDto;
import com.project.backend.dto.UserDto;
import com.project.backend.entity.User;
import com.project.backend.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	
	
	@Autowired
	private UserService userservice; 
	  
	
	@PostMapping("/user/login")
	public ResponseEntity<?> login(@RequestBody LoginDto login,HttpSession session){
		
		User user = userservice.getUserByEmail(login.getEmail());
		if (user != null) {
			session.setAttribute("userid", user.getEmail());
			session.setAttribute("valid", true);
			session.setAttribute("role", "user");
			return new ResponseEntity<>(new UserDto(user),HttpStatus.OK);		
			}
		return null;
		
	}
	
	@PostMapping("/user/logout")
	public ResponseEntity<?> logout(@RequestBody LoginDto login,HttpSession session){
		
		session.invalidate();
		return new ResponseEntity<>("logged out",HttpStatus.OK);
		
	}

}


