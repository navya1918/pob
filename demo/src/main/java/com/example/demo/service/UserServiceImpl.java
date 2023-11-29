package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
//@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
		//convert userdto to jpa entity
		User user = UserMapper.mapToUser(userDto);
				
		
		User savedUser = repo.save(user);
		
		
		//JPA to entity
		
		UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
		
		return savedUserDto;
	}
	
	 @Override
	    public UserDto getUserById(Long userId) {
	        Optional<User> optionalUser = repo.findById(userId);
	        UserDto optionaluserdto = UserMapper.mapToUserDto(optionalUser.get());
	        return optionaluserdto;
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return repo.findAll();
	    }

	    @Override
	    public User updateUser(User user) {
	        User existingUser = repo.findById(user.getId()).get();
	        existingUser.setFirstName(user.getFirstName());
	        existingUser.setLastName(user.getLastName());
	        existingUser.setEmailid(user.getEmailid());
	        User updatedUser = repo.save(existingUser);
	        return updatedUser;
	    }

	    @Override
	    public void deleteUser(Long userId) {
	        repo.deleteById(userId);
	    }

}
