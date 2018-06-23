package com.etc.entity;

/**
 * ʵ���� �ҵľ����
 * @author HongPeiQi
 *
 */
public class Mybidding {
	
	private int bid_id; //������� ����
	private int user_id; //�û���� ���
	private int good_id; //��Ʒ��� ���
	private double user_price; //�û��ľ��ļ۸�
	private int goods_state; //��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
	private String goods_buydate; //��������
	
	/**
	 * Ĭ�Ϲ���
	 */
	public Mybidding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * ����ʱ���ù���	
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
	 * ��������
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
