package com.etc.dao.impl;

import org.springframework.stereotype.Repository;

import com.etc.dao.AddressDao;
import com.etc.entity.ShoppingAddress;

/**
 * ��؛��ַ�������Pdao���F� 
 * @author HongPeiQi
 *
 */
@Repository(value="addressDao")
public class AddressDaoImpl implements AddressDao {

	@Override
	public boolean addAddress(ShoppingAddress address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAddress(ShoppingAddress address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAddress(int address_id) {
		// TODO Auto-generated method stub
		return false;
	}

}
