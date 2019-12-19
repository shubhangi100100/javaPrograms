package com.iris.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iris.daos.UserDao;
import com.iris.models.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	
	
	@RequestMapping(value="/getAllUsers", method=RequestMethod.GET)
	public ModelAndView getAllUsers() {
		List<User> user= userDao.getAllUsers();
		ModelAndView mv= new ModelAndView("ViewAllUsers");
		mv.addObject("usersList", user);
		System.out.println(user);
		return mv;
		
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable int id) {
		System.out.println("User to delete = "+id);
		User uObj=userDao.getUserById(id);
		System.out.println("User Obj = "+uObj);
		
		userDao.deleteUser(uObj);
		
		ModelAndView mv=new ModelAndView("UsersList");
		mv.addObject("usersList",userDao.getAllUsers());
		mv.addObject("msg","User deleted Succesfully...");
		return mv;
	}
	
	@RequestMapping(value="/updateUser/{id}", method=RequestMethod.GET)
	public ModelAndView getUpdatedUserForm(@PathVariable int id)
	{
	User uObj=userDao.getUserById(id);
	ModelAndView mv= new ModelAndView("SignUpForm");
	mv.addObject("uObj", uObj);
	mv.addObject("btnLabel","update");
	mv.addObject("FormLabel", "update form");
	return mv;
	
	}
	}
	

