package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public interface UserService {
	
	 UserDto createUser(UserDto user);
	 UserDto getUserById(Long userId);

	    List<User> getAllUsers();

	    User updateUser(User user);

	    void deleteUser(Long userId);

}
