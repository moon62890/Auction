package com.etc.service;

import com.etc.entity.ShoppingAddress;

/**
 * 收貨地址相關Service
 * @author HongPeiQi
 *
 */
public interface AddressService {
	
	/**
	 * 添加地址
	 * @param address
	 * @return True添加成功 False添加失敗
	 */
	public boolean addAddress(ShoppingAddress address);
	
	/**
	 * 更新地址
	 * @param address
	 * @return True更新成功 False更新失敗
	 */
	public boolean updateAddress(ShoppingAddress address);
	
	/**
	 * 刪除地址
	 * @param address_id
	 * @return True刪除成功  False刪除失敗
	 */
	public boolean deleteAddress(int address_id);

}
