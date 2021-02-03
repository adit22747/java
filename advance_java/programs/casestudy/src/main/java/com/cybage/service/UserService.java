package com.cybage.service;

import java.util.List;

import com.cybage.model.User;

public interface UserService {
	public int addUser(User user) throws Exception;
	public List<User> findUser() throws Exception;
	public User findUserById(int id);
	public boolean deleteUser(int id);
	public boolean updateUser(User user);
}
