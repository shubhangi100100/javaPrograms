package com.iris.models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User123")
public class User {
  private int UserId;
  private String UserName;
  private String Password;
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
@Override
public String toString() {
	return "User [UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + "]";
}
  
}

