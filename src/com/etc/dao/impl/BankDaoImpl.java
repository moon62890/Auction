package com.etc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.dao.BankDao;
import com.etc.entity.BankCard;

/**
 * „y––ø®Ωâ∂®œ‡ÍPòIÑ’dao åç¨FÓê
 * @author HongPeiQi
 *
 */
@Repository(value="bankDao")
public class BankDaoImpl implements BankDao {

	@Override
	public boolean addBankCard(BankCard card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBankCard(BankCard card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBankCard(int bankcard_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BankCard> queryBankCardByUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankCard queryBankCard(int bankcard_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
