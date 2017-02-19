package com.aisi.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aisi.dao.UserMapper;
import com.aisi.pojo.User;
import com.aisi.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
    
    public User getUserByName(String name) {
        return userDao.selectByName(name);
    }

	@Override
	public void save(User user) {
		
		userDao.insert(user);
		
	}

	@Override
	public void delete(int id) {
		userDao.deleteByPrimaryKey(id);
	}

}