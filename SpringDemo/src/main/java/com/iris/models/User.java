package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="UserTable")
public class User {
	
	@Id
	@NotNull(message="you need an id")
	private Integer userId;
	
	@NotNull(message="name cant be empty")
	@Size(min=3,message="Username should be minium 3 letters")
	private String userName;
	@NotEmpty
	@Size(min=7,max=12,message="Password should be between 7 to 12 characters")
	@Column(name="UserPass")
	private String password;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String role;
	
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "HomeController [userId=" + userId + ", userName=" + userName + ", password=" + password + ", gender="
				+ gender + "]";
	}

	}


