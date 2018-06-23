package com.etc.dao;

import com.etc.entity.ShoppingAddress;

/**
 * ��؛��ַ���Pdao
 * @author HongPeiQi
 *
 */
public interface AddressDao {
	
	/**
	 * ��ӵ�ַ
	 * @param address
	 * @return True��ӳɹ� False���ʧ��
	 */
	public boolean addAddress(ShoppingAddress address);
	
	/**
	 * ���µ�ַ
	 * @param address
	 * @return True���³ɹ� False����ʧ��
	 */
	public boolean updateAddress(ShoppingAddress address);
	
	/**
	 * �h����ַ
	 * @param address_id
	 * @return True�h���ɹ�  False�h��ʧ��
	 */
	public boolean deleteAddress(int address_id);

}
