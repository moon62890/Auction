package com.etc.dao;

import java.util.List;

import com.etc.entity.Mybidding;

/**
 * �������Pdao
 * @author HongPeiQi
 *
 */
public interface BidDao {

	/**
	 * ��Ӹ��˼o�
	 * @param bid
	 * @return True ��ӳɹ� False���ʧ��
	 */
	public boolean addBid(Mybidding bid);
	
	/**
	 * ������Ʒ��̖->��ԃ���ٵĸ��˼o�
	 * @param good_id ��Ʒ��̖
	 * @return List
	 */
	public List<Mybidding> queryBiddingByGoodsId(int good_id);
	
	/**
	 * ��ԃ�Ñ����˼o�
	 * @param user_id �Ñ���̖
	 * @return List
	 */
	public List<Mybidding> queryMyBidding(int user_id);
	
	/**
	 * �������ˠ�B->��Ӎ�Ñ����˼o�
	 * @param user_id
	 * @param bid_state
	 * @return List
	 */
	public List<Mybidding> queryMyBiddingByType(int user_id,int bid_state);
	
	/**
	 * �������˼o䛾�̖->��ԃ���˼o�Ԕ���Y��
	 * @param bid_id ���˼o䛾�̖
	 * @return 
	 */
	public Mybidding queryMyBiddingByBidId(int bid_id );
	
	/**
	 * ���¸��˼o�
	 * @param bid ���˼o�
	 * @return True ���³ɹ� False����ʧ�� 
	 */
	public boolean updateMyBidding(Mybidding bid);
	


}
