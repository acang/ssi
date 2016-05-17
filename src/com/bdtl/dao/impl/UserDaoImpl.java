package com.bdtl.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.bdtl.bean.User;
import com.bdtl.dao.UserDao;

@Repository
public class UserDaoImpl  implements UserDao {

	@Override
	public User findUserByUsername(String username) {
		User user = new User();
		user.setId(1);
		user.setUsername("百大天利");
		user.setPassword("454545");
		
		
		
		return user;
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
