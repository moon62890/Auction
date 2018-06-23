package com.etc.service;

import java.util.List;

import com.etc.entity.Goods;

/**
 * ��Ʒ���PService
 * @author HongPeiQi
 *
 */
public interface GoodsService {
	
	/**
	 * �������Ʒ
	 * @param goods ��Ʒ
	 * @return ture ��ӳɹ� false ���ʧ��
	 */
	public boolean addGoods(Goods goods);
	
	/**
	 * ��ԃ������Ʒ
	 * @return List
	 */
	public List<Goods> queryGoods();
	
	/**
	 * ������ƷID ��ԃ��ƷԔ���YӍ
	 * @param goods_id  ��Ʒ��̖
	 * @return Goods
	 */
	public Goods queryGoodsByID(int goods_id);
	
	
	/**
	 * ������Ʒ���Q ��ģ����ԃ
	 * @param goods_name ��Ʒ���Q
	 * @return List
	 */
	public List<Goods> queryGoodsByName(String goods_name);
	
	/**
	 * ������Ʒe��ԃ
	 * @param goods_typeid ��Ʒe��̖
	 * @return List
	 */
	public List<Goods> queryGoodsByType(int goods_typeid);
	
	
	/**
	 * �����Ñ�ID ��ԃ�����ٵ���Ʒ
	 * @param user_id �Ñ�ID
	 * @return List
	 */
	public List<Goods> queryGoodsByUserId(int user_id);
	
	/**
	 * �����Ñ�ID �c ��Ʒe����ԃ
	 * @param user_id �Ñ���̖
	 * @param goods_typeid ��Ʒe��̖
	 * @return List
	 */
	public List<Goods> queryGoodsByUserIdAndType(int user_id,int goods_typeid);
	
	
	/**
	 * ����ӆ��
	 * @param goods ��Ʒ
	 * @return True ��ӳɹ� False���ʧ��
	 */
	public boolean updateGoods(Goods goods);

}
