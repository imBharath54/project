package com.project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.backend.dto.UserDto;
import com.project.backend.entity.User;
import com.project.backend.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	@Override
	public boolean addUser(UserDto user) {

		User savedUser = userRepository.save(new User(user));
		if(savedUser != null) {
			return true;
		}
		return false;
	}
	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByemail(email);
		return user;
	}

}
