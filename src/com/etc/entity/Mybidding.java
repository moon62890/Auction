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
	private double bid_price; //�û��ľ��ļ۸�
	private int bid_state; //��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
	private String bid_date; //��������
	
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
	public Mybidding(int user_id, int good_id, double bid_price, int bid_state, String bid_date) {
		super();
		this.user_id = user_id;
		this.good_id = good_id;
		this.bid_price = bid_price;
		this.bid_state = bid_state;
		this.bid_date = bid_date;
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
	public Mybidding(int bid_id, int user_id, int good_id, double bid_price, int bid_state, String bid_date) {
		super();
		this.bid_id = bid_id;
		this.user_id = user_id;
		this.good_id = good_id;
		this.bid_price = bid_price;
		this.bid_state = bid_state;
		this.bid_date = bid_date;
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


	public double getBid_price() {
		return bid_price;
	}


	public void setBid_price(double bid_price) {
		this.bid_price = bid_price;
	}


	public int getBid_state() {
		return bid_state;
	}


	public void setBid_state(int bid_state) {
		this.bid_state = bid_state;
	}


	public String getBid_date() {
		return bid_date;
	}


	public void setBid_date(String bid_date) {
		this.bid_date = bid_date;
	}


	@Override
	public String toString() {
		return "Mybidding [bid_id=" + bid_id + ", user_id=" + user_id + ", good_id=" + good_id + ", bid_price="
				+ bid_price + ", bid_state=" + bid_state + ", bid_date=" + bid_date + "]";
	}
	
}
