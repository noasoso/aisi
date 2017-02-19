package com.aisi.service;

import com.aisi.pojo.User;

public interface IUserService {

	public User getUserById(int userId);
	
	public User getUserByName(String name);
	
	void save(User user);
	
	void delete(int userId);
}