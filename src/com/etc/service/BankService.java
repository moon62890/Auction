package com.etc.service;

import java.util.List;

import com.etc.entity.BankCard;

/**
 * �y�в������PService
 * @author HongPeiQi
 *
 */
public interface BankService {

	/**
	 * ����y�п�
	 * @param card
	 * @return True��ӳɹ� False���ʧ��
	 */
	public boolean addBankCard(BankCard card);
	
	/**
	 * �����y�п�
	 * @param card
	 * @return True���³ɹ� False����ʧ��
	 */
	public boolean updateBankCard(BankCard card);
	
	/**
	 * �h���y�п�
	 * @param bankcard_id �y�п���̖
	 * @return True�h���ɹ�  False�h��ʧ��
	 */
	public boolean deleteBankCard(int bankcard_id);
	
	/**
	 * ��ԃ�Ñ����y�п����
	 * @param user_id �Ñ���̖
	 * @return
	 */
	public List<BankCard> queryBankCardByUserId(int user_id);
	
	/**
	 * ��ԃ�y�п�Ԕ���Y��
	 * @param bankcard_id �y�п���̖
 	 * @return
	 */
	public BankCard queryBankCard(int bankcard_id);
}
