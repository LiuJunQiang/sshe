package com.sshe.controller;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger log =Logger.getLogger(this.getClass());
	
	public String login(){
		log.info("hello login!!");
		return "success";
	}
}
