package com.etc.service;

import java.util.List;

import com.etc.entity.Users;
import com.etc.util.PageData;

/**
 * 用戶相關Service
 * @author HongPeiQi
 *
 */
public interface UserService {

	/**
	 * 添加用戶
	 * @param user
	 * @return
	 */
	public boolean addUser(Users user);
	
	/**
	 * 更新用戶
	 * @param user
	 * @return
	 */
	public boolean updateUser(Users user);	
	/**
	 * 查詢所有用戶
	 * @param page 當前頁數
	 * @param pageSize 總頁數
	 * @param param 參數
	 * @return
	 */
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param);
	
	/**
	 * 依據用戶編號->查詢用戶詳細資訊
	 * @param user_id 用戶編號
	 * @return
	 */
	public Users queryUsersById(int user_id);
	
	/**
	 * 依據用戶名子->查詢用戶(模糊查詢)
	 * @param user_realName 用戶名子
	 * @return
	 */
	public List<Users> queryUsersByName(String user_realName);
	
	/**
	 * 依據用戶狀態->查詢用戶
	 * @param user_state
	 * @return
	 */
	public PageData<Users> queryUserByState(Integer pageNo, Integer pageSize,int user_state);
}
