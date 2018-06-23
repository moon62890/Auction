package com.etc.entity;

/**
 * 实体类 我的竞标表
 * @author HongPeiQi
 *
 */
public class Mybidding {
	
	private int bid_id; //竞标表编号 自增
	private int user_id; //用户编号 外键
	private int good_id; //商品编号 外键
	private double user_price; //用户的竞拍价格
	private int goods_state; //商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
	private String goods_buydate; //竞标日期
	
	/**
	 * 默认构造
	 */
	public Mybidding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 新增时调用构造	
	 * @param user_id
	 * @param good_id
	 * @param user_price
	 * @param goods_state
	 * @param goods_buydate
	 */
	public Mybidding(int user_id, int good_id, double user_price, int goods_state, String goods_buydate) {
		super();
		this.user_id = user_id;
		this.good_id = good_id;
		this.user_price = user_price;
		this.goods_state = goods_state;
		this.goods_buydate = goods_buydate;
	}

	/**
	 * 完整构造
	 * @param bid_id
	 * @param user_id
	 * @param good_id
	 * @param user_price
	 * @param goods_state
	 * @param goods_buydate
	 */
	public Mybidding(int bid_id, int user_id, int good_id, double user_price, int goods_state, String goods_buydate) {
		super();
		this.bid_id = bid_id;
		this.user_id = user_id;
		this.good_id = good_id;
		this.user_price = user_price;
		this.goods_state = goods_state;
		this.goods_buydate = goods_buydate;
	}


	public int getBid_id() {
		return bid_id;
	}
	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGood_id() {
		return good_id;
	}
	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}
	public double getUser_price() {
		return user_price;
	}
	public void setUser_price(double user_price) {
		this.user_price = user_price;
	}
	public int getGoods_state() {
		return goods_state;
	}
	public void setGoods_state(int goods_state) {
		this.goods_state = goods_state;
	}
	public String getGoods_buydate() {
		return goods_buydate;
	}
	public void setGoods_buydate(String goods_buydate) {
		this.goods_buydate = goods_buydate;
	}
	
	@Override
	public String toString() {
		return "Mybidding [bid_id=" + bid_id + ", user_id=" + user_id + ", good_id=" + good_id + ", user_price="
				+ user_price + ", goods_state=" + goods_state + ", goods_buydate=" + goods_buydate + "]";
	}
	
}
