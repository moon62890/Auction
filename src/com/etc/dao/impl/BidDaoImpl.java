package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.BidDao;
import com.etc.entity.Mybidding;

/**
 * ∏ÇòÀòIÑ’œ‡ÍPdaoåç¨FÓê
 * @author HongPeiQi
 *
 */
public class BidDaoImpl implements BidDao {

	@Override
	public boolean addBid(Mybidding bid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Mybidding> queryBiddingByGoodsId(int good_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mybidding> queryMyBidding(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mybidding> queryMyBiddingByType(int user_id, int bid_state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mybidding queryMyBiddingByBidId(int bid_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateMyBidding(Mybidding bid) {
		// TODO Auto-generated method stub
		return false;
	}

}
