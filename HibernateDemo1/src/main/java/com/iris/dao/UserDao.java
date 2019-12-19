package com.iris.dao;

import java.util.List;

import com.iris.models.User;

	
public interface UserDao {
	public boolean saveUser(User uobj);
	public User getUser(int id);
	public List<User> getAllUsers();
	

}
