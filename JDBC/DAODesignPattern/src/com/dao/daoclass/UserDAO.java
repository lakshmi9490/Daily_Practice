package com.dao.daoclass;

import java.util.List;

import com.dao.model.User;

public interface UserDAO {
	int insertUser(User user);
	List<User> getAllUser();
	User getUserById(int id);
	int deleteUserById(int id);
	int updatedUserById(int id,String address);
}
