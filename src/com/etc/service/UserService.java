package com.etc.service;

import java.util.List;

import com.etc.entity.Users;
import com.etc.util.PageData;

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
	 * @param page ��ǰ퓔�
	 * @param pageSize ��퓔�
	 * @param param ����
	 * @return
	 */
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param);
	
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
	public PageData<Users> queryUserByState(Integer pageNo, Integer pageSize,int user_state);
}
