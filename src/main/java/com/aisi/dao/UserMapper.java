package com.aisi.dao;

import com.aisi.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);
    
    User selectByName(String name);
}