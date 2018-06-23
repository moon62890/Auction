package com.etc.entity;

/**
 * 实体类 订单表
 * @author HongPeiQi
 *
 */
public class Order {
	
	private int order_id;
	private int user_id;
	private int goods_id;
	private String address_id;
	private String senddate;
	private String payment;
	private double sendprice;
	private int orderstate;
	
	/**
	 * 默认构造
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造	
	 * @param user_id
	 * @param goods_id
	 * @param address_id
	 * @param senddate
	 * @param payment
	 * @param sendprice
	 * @param orderstate
	 * @param goods_buydate
	 */
	public Order(int user_id, int goods_id, String address_id, String senddate, String payment, double sendprice,
			int orderstate, String goods_buydate) {
		super();
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.address_id = address_id;
		this.senddate = senddate;
		this.payment = payment;
		this.sendprice = sendprice;
		this.orderstate = orderstate;
		this.goods_buydate = goods_buydate;
	}
	
	/**
	 * 完整构造
	 * @param order_id
	 * @param user_id
	 * @param goods_id
	 * @param address_id
	 * @param senddate
	 * @param payment
	 * @param sendprice
	 * @param orderstate
	 * @param goods_buydate
	 */
	public Order(int order_id, int user_id, int goods_id, String address_id, String senddate, String payment,
			double sendprice, int orderstate, String goods_buydate) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.address_id = address_id;
		this.senddate = senddate;
		this.payment = payment;
		this.sendprice = sendprice;
		this.orderstate = orderstate;
		this.goods_buydate = goods_buydate;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getSenddate() {
		return senddate;
	}
	public void setSenddate(String senddate) {
		this.senddate = senddate;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public double getSendprice() {
		return sendprice;
	}
	public void setSendprice(double sendprice) {
		this.sendprice = sendprice;
	}
	public int getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}
	public String getGoods_buydate() {
		return goods_buydate;
	}
	public void setGoods_buydate(String goods_buydate) {
		this.goods_buydate = goods_buydate;
	}
	private String goods_buydate;


	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user_id=" + user_id + ", goods_id=" + goods_id + ", address_id="
				+ address_id + ", senddate=" + senddate + ", payment=" + payment + ", sendprice=" + sendprice
				+ ", orderstate=" + orderstate + ", goods_buydate=" + goods_buydate + "]";
	}
	
	
}
