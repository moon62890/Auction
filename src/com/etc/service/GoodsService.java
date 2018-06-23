package com.etc.service;

import java.util.List;

import com.etc.entity.Goods;

/**
 * 商品相關Service
 * @author HongPeiQi
 *
 */
public interface GoodsService {
	
	/**
	 * 添加新商品
	 * @param goods 商品
	 * @return ture 添加成功 false 添加失敗
	 */
	public boolean addGoods(Goods goods);
	
	/**
	 * 查詢所有商品
	 * @return List
	 */
	public List<Goods> queryGoods();
	
	/**
	 * 依據商品ID 查詢商品詳細資訊
	 * @param goods_id  商品編號
	 * @return Goods
	 */
	public Goods queryGoodsByID(int goods_id);
	
	
	/**
	 * 依據商品名稱 做模糊查詢
	 * @param goods_name 商品名稱
	 * @return List
	 */
	public List<Goods> queryGoodsByName(String goods_name);
	
	/**
	 * 依據商品類別查詢
	 * @param goods_typeid 商品類別編號
	 * @return List
	 */
	public List<Goods> queryGoodsByType(int goods_typeid);
	
	
	/**
	 * 依據用戶ID 查詢他所屬的商品
	 * @param user_id 用戶ID
	 * @return List
	 */
	public List<Goods> queryGoodsByUserId(int user_id);
	
	/**
	 * 依據用戶ID 與 商品類別做查詢
	 * @param user_id 用戶編號
	 * @param goods_typeid 商品類別編號
	 * @return List
	 */
	public List<Goods> queryGoodsByUserIdAndType(int user_id,int goods_typeid);
	
	
	/**
	 * 更新訂單
	 * @param goods 商品
	 * @return True 添加成功 False添加失敗
	 */
	public boolean updateGoods(Goods goods);

}
