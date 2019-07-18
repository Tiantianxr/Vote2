package com.bcu.service;

import com.bcu.bean.User;
import com.bcu.dao.UserDao;

public class UserService {
    private UserDao userDao=new UserDao();
    public int insertUser(User user){
		return userDao.insertUser(user);	
    }
    public User querUser(String username,String password){
    	return userDao.queryUser(username, password);
    }
}
