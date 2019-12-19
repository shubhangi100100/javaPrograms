package com.iris.daos;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.iris.models.User;
/* all the CRUD operations will go under transactional annotation*/ 
@Transactional
public interface UserDao {
	
	public boolean registerUser(User uObj);
	public User validateUser(int Id, String password);
	public List <User> getAllUsers();
	public boolean deleteUser(User uObj);
	public boolean updateUser(User uObj);
	public User getUserById(int id);
	
	
}
