package com.iris.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iris.daos.UserDao;
import com.iris.models.User;
@Controller
public class HomeController{
	@Autowired
	UserDao UserDao;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sayHello(ModelMap map) {
	map.addAttribute("msg", "Welcome to Spring Web MVC");
	return "HomePage";
	}
	
	@RequestMapping(value="/SignUp", method= RequestMethod.GET)
	public String addUser(ModelMap map) {
		map.addAttribute("uObj", new User());
		return "SignUpForm";
	
	
	}
	@RequestMapping(value="/Successful", method= RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("uObj") User uObj,  BindingResult result, ModelMap map) {

		if(result.hasErrors()){
			
		return "SignUpForm";
		}
		else {
		
		uObj.setRole("user");
		UserDao.registerUser(uObj);
		
		map.addAttribute("msg", "You have successfully registered, now you can login.");
		return "Login";
		}
	}
	
	@RequestMapping(value="/getSignInForm", method= RequestMethod.GET)
	public String getSignInForm() {
		return "Login";
		
	}
	
	@Autowired
	HttpSession session;
	
	
	@RequestMapping(value="/Succ",method=RequestMethod.POST)
	public String validateUser(@RequestParam int userId, @RequestParam String password, ModelMap map) {
		User uObj= UserDao.validateUser(userId, password);
		if(uObj== null){
		map.addAttribute("msg1", "Sorry, u are not registered user");
		return "Login";
		
		}
		else {
			session.setAttribute("uObj", uObj);
			if(uObj.getRole().equals("admin")) {
				return "AdminPage";
				
			}
			else {
				session.setAttribute("uObj", uObj);
				return "Successful";
				
			}
		
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}