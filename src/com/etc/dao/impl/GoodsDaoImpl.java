package com.etc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.dao.GoodsDao;
import com.etc.entity.Goods;

/**
 * ��Ʒ���P�I��dao ���F�
 * @author HongPeiQi
 *
 */
@Repository(value="goodsDao")
public class GoodsDaoImpl implements GoodsDao {

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
