package com.sshe.dao.impl;


import org.springframework.stereotype.Repository;

import com.sshe.dao.UserDao;
import com.test.beans.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	
	
	@Override
	public User login(User user) {
		
		 User u = (User) super.getSession().createQuery(
				"from User a where a.username=:username and a.password=:password")
				.setParameter("username", user.getUsername()).setParameter(
				"password", user.getPassword()).uniqueResult();
		System.out.println(u.toString());
		 return u;
	}

}
