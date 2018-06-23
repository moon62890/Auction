package com.etc.service.impl;

import java.util.List;

import com.etc.entity.Mybidding;
import com.etc.service.BidService;

/**
 * ∏ÇòÀòIÑ’œ‡ÍPServiceåç¨FÓê
 * @author HongPeiQi
 *
 */
public class BidServiceImpl implements BidService {

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
