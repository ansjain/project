package com.niit.shoppingbackend.dao;

import java.util.List;

public interface UserDetail {
	public boolean addUserDetail(UserDetail UserDetail);
	public boolean updateUserDetail(UserDetail UserDetail);
	public boolean deleteUserDetail(int UserDetailId);
	public List<UserDetail> getAllUserDetail();
	public UserDetail getUserDetailById(int UserDetailId);
	
}
