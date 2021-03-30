package com.xh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xh.entiy.User;
import com.xh.repository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveStudent(User user){
		userRepository.save(user);
	}
}
