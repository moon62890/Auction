package com.etc.dao;

import java.util.List;

import com.etc.entity.Mybidding;

/**
 * 競標相關dao
 * @author HongPeiQi
 *
 */
public interface BidDao {

	/**
	 * 添加競標紀錄
	 * @param bid
	 * @return True 添加成功 False添加失敗
	 */
	public boolean addBid(Mybidding bid);
	
	/**
	 * 根據商品編號->查詢所屬的競標紀錄
	 * @param good_id 商品編號
	 * @return List
	 */
	public List<Mybidding> queryBiddingByGoodsId(int good_id);
	
	/**
	 * 查詢用戶競標紀錄
	 * @param user_id 用戶編號
	 * @return List
	 */
	public List<Mybidding> queryMyBidding(int user_id);
	
	/**
	 * 根據競標狀態->查訊用戶競標紀錄
	 * @param user_id
	 * @param bid_state
	 * @return List
	 */
	public List<Mybidding> queryMyBiddingByType(int user_id,int bid_state);
	
	/**
	 * 根據競標紀錄編號->查詢競標紀錄詳細資料
	 * @param bid_id 競標紀錄編號
	 * @return 
	 */
	public Mybidding queryMyBiddingByBidId(int bid_id );
	
	/**
	 * 更新競標紀錄
	 * @param bid 競標紀錄
	 * @return True 更新成功 False更新失敗 
	 */
	public boolean updateMyBidding(Mybidding bid);
	


}
