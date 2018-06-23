package com.etc.service.impl;

import java.util.List;

import com.etc.dao.GoodsDao;
import com.etc.entity.Goods;

/**
 * …Ã∆∑œ‡ÍPòIÑ’Service åç¨FÓê
 * @author HongPeiQi
 *
 */
public class GoodsServiceImpl implements GoodsDao {

	@Override
	public boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Goods> queryGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods queryGoodsByID(int goods_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> queryGoodsByName(String goods_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> queryGoodsByType(int goods_typeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> queryGoodsByUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> queryGoodsByUserIdAndType(int user_id, int goods_typeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return false;
	}

}
