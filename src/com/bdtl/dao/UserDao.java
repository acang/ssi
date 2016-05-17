package com.bdtl.dao;

import java.util.List;

import com.bdtl.bean.User;

public interface UserDao 
{
	/*
	 * 根据用户名查找用户信息
	 */
	public User findUserByUsername(String username);
	
	/*
	 * 根据用户名查找用户信息
	 */
	public List<User> findAllUser();
	
	/*
	 * 新增用户信息
	 */
	public boolean addUser(User user);
	
	/*
	 * 删除用户信息
	 */
	public boolean deleteUser(User user);
	
	/*
	 * 修改用户信息
	 */
	public boolean modifyUser(User user);
}
