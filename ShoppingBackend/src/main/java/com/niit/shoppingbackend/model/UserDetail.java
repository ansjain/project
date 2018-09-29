package com.niit.shoppingbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class UserDetail {
	@Id   //primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int UserDetailId;
	private String UserDetailName;
	private String UserDetailDescription;
	public int getUserDetailId() {
		return UserDetailId;
	}
	public void setUserDetailId(int UserDetailId) {
		this.UserDetailId = UserDetailId;
	}
	public String getUserDetailName() {
		return UserDetailName;
	}
	public void setUserDetailName(String UserDetailName) {
		this.UserDetailName = UserDetailName;
	}
	public String getUserDetailDescription() {
		return UserDetailDescription;
	}
	public void setUserDetailDescription(String UserDetailDescription) {
		this.UserDetailDescription = UserDetailDescription;
	}
	
}
