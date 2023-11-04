package com.chaitu.springboot.mydiary.service;

import java.util.List;

import com.chaitu.springboot.mydiary.entity.User;

public interface UserService {
	
	public User saveUser(User user );
	public User updateUser(User user);
	public void deleteUser(User user);
	public User findById(long id);
	public List<User> findAll();
	public User findByUserName(String username);

}
