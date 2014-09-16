package com.hans.action;

import com.hans.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login() {
		if (user.getUsername().equalsIgnoreCase(user.getPassword()))
			return SUCCESS;
		return ERROR;
	}
	
	public String register() {
		return ERROR;
	}
}
