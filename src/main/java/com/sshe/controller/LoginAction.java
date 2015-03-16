package com.sshe.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.sshe.service.UserService;
import com.test.beans.User;



public class LoginAction extends ActionSupport{
	
	@Resource
	private UserService userService;
	
	private static final long serialVersionUID = 1L;
	private Logger log =Logger.getLogger(this.getClass());
	
	private String username;
	private String password;
	

	public String login(){
		log.info("hello login!!");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		User u = userService.login(user);
		
		return ERROR;
	}

	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
}
