package com.etc.service;

import java.util.List;

import com.etc.entity.BankCard;

/**
 * 銀行操作相關Service
 * @author HongPeiQi
 *
 */
public interface BankService {

	/**
	 * 添加銀行卡
	 * @param card
	 * @return True添加成功 False添加失敗
	 */
	public boolean addBankCard(BankCard card);
	
	/**
	 * 更新銀行卡
	 * @param card
	 * @return True更新成功 False更新失敗
	 */
	public boolean updateBankCard(BankCard card);
	
	/**
	 * 刪除銀行卡
	 * @param bankcard_id 銀行卡編號
	 * @return True刪除成功  False刪除失敗
	 */
	public boolean deleteBankCard(int bankcard_id);
	
	/**
	 * 查詢用戶的銀行卡清單
	 * @param user_id 用戶編號
	 * @return
	 */
	public List<BankCard> queryBankCardByUserId(int user_id);
	
	/**
	 * 查詢銀行卡詳細資料
	 * @param bankcard_id 銀行卡編號
 	 * @return
	 */
	public BankCard queryBankCard(int bankcard_id);
}
