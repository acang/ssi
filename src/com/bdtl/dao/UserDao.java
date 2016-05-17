package com.bdtl.dao;

import java.util.List;

import com.bdtl.bean.User;

public interface UserDao 
{
	/*
	 * �����û��������û���Ϣ
	 */
	public User findUserByUsername(String username);
	
	/*
	 * �����û��������û���Ϣ
	 */
	public List<User> findAllUser();
	
	/*
	 * �����û���Ϣ
	 */
	public boolean addUser(User user);
	
	/*
	 * ɾ���û���Ϣ
	 */
	public boolean deleteUser(User user);
	
	/*
	 * �޸��û���Ϣ
	 */
	public boolean modifyUser(User user);
}
