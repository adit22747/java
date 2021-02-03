package com.cybage.service;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.model.User;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public int addUser(User user) throws Exception{
		user.setId(generateId());
		return userDao.addUser(user);
	}

	private int generateId() {
		return (int)Math.round(Math.random()*99999);
	}

	public List<User> findUser() throws Exception {
		return userDao.findUser();
	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
