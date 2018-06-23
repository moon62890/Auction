package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.UserDao;
import com.etc.entity.Users;
import com.etc.service.UserService;

/**
 * ”√ëÙœ‡ÍPServiceåç¨FÓê
 * @author HongPeiQi
 *
 */
@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Users> queryUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Users queryUsersById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> queryUsersByName(String user_realName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> queryUserByState(int user_state) {
		// TODO Auto-generated method stub
		return null;
	}

}
