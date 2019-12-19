package com.iris.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User1234")
public class User {
	
	
	  private int UserId;
	  private String UserName;
	  private String Password;
	  private String City;
	  private String Role;
	  
	  public User() {
			super();
			
	  }
	
	public User(int userId, String userName, String password, String city, String role ) {
		super();
		UserId = userId;
		UserName = userName;
		Password = password;
		City = city;
		Role = role;
		
	}
	@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	  
	  public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getRole() {
		return Role;
	}
	public void setRole() {
		this.Role = "customer";
	}
	

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
	  
	}
