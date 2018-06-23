package com.etc.service;

import java.util.List;

import com.etc.entity.Users;

/**
 * �Ñ����PService
 * @author HongPeiQi
 *
 */
public interface UserService {

	/**
	 * ����Ñ�
	 * @param user
	 * @return
	 */
	public boolean addUser(Users user);
	
	/**
	 * �����Ñ�
	 * @param user
	 * @return
	 */
	public boolean updateUser(Users user);	
	/**
	 * ��ԃ�����Ñ�
	 * @return
	 */
	public List<Users> queryUsers();
	
	/**
	 * �����Ñ���̖->��ԃ�Ñ�Ԕ���YӍ
	 * @param user_id �Ñ���̖
	 * @return
	 */
	public Users queryUsersById(int user_id);
	
	/**
	 * �����Ñ�����->��ԃ�Ñ�(ģ����ԃ)
	 * @param user_realName �Ñ�����
	 * @return
	 */
	public List<Users> queryUsersByName(String user_realName);
	
	/**
	 * �����Ñ���B->��ԃ�Ñ�
	 * @param user_state
	 * @return
	 */
	public List<Users> queryUserByState(int user_state);
}
