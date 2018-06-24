package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.etc.dao.UserDao;
import com.etc.dao.impl.UserDaoImpl;
import com.etc.entity.Users;
import com.etc.service.UserService;
import com.etc.util.PageData;

/**
 * ”√ëÙœ‡ÍPServiceåç¨FÓê
 * @author HongPeiQi
 *
 */
@Service(value="userService")
public class UserServiceImpl implements UserService {

	Logger logger = Logger.getLogger(UserServiceImpl.class);
	
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
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param) {
		// TODO Auto-generated method stub
		return userDao.queryUsers(page, pageSize, null);
	}
	
	@Override
	public Users queryUsersById(int user_id) {
		// TODO Auto-generated method stub
		return userDao.queryUsersById(user_id);
	}

	@Override
	public List<Users> queryUsersByName(String user_realName) {
		// TODO Auto-generated method stub
		return userDao.queryUsersByName(user_realName);
	}

	@Override
	public PageData<Users> queryUserByState(Integer page, Integer pageSize,int user_state) {
		// TODO Auto-generated method stub
		return userDao.queryUserByState(page, pageSize, user_state);
	}

}
