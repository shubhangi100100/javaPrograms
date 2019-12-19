package com.iris.Hibernate;

import java.util.List;

import com.iris.dao.UserDao;
import com.iris.daosImpl.UserDaoImpl;
import com.iris.models.User;


public class App 
{
    public static void main( String[] args )
    {
    	User uobj= new User();
    	uobj.setUserId(1);
    	uobj.setUserName("Shubhangi");
    	uobj.setPassword("sss");
    	
    	
    	UserDao uDao= new UserDaoImpl();
    	uDao.saveUser(uobj);
    	uobj= uDao.getUser(2);
    	System.out.println(uobj);
    	
    	List<User> ulist=uDao.getAllUsers();
    	for(User s:ulist) {
    		System.out.println(s);
    		
    	}
    }
}
