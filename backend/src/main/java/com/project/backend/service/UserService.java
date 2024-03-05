package com.project.backend.service;

import com.project.backend.dto.UserDto;
import com.project.backend.entity.User;

public interface UserService {
	
	boolean addUser(UserDto user);
	User getUserByEmail(String email);

}
