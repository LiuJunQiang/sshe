package com.sshe.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sshe.dao.UserDao;
import com.sshe.service.UserService;
import com.test.beans.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
