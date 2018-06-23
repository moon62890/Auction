package com.etc.entity;

/**
 * ʵ���� ��Ʒ��
 * @author HongPeiQi
 *
 */
public class Goods {

	private int goods_id; //��Ʒ��� ����
	private String goods_name; //��Ʒ����
	private double goods_minprice; //��Ʒ���ļ۸�
	private double goods_currentprice; //��Ʒ��ǰ���ļ۸�
	private double goods_getprice; //��Ʒ�ñ�۸�
	private int goods_typeid; //��Ʒ���ͱ��
	private String goods_desc; //��Ʒ����
	private int good_state; //��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
	private int user_id; //�û����
	private double goods_minpremium; //��ͼӼ�
	private int goods_auctiontime; //��Ʒ����ʱ�䣨��λ���죩
	private double goods_margin; //��Ʒ���ı�֤��
	private String goods_create; //����ʱ��
	private String goods_modified; //����ʱ��
		
	
	/**
	 * Ĭ�Ϲ���
	 */
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ����ʱ���ù���	
	 * @param goods_name ��Ʒ����
	 * @param goods_minprice ��Ʒ���ļ۸�
	 * @param goods_currentprice ��Ʒ��ǰ���ļ۸�
	 * @param goods_getprice ��Ʒ�ñ�۸�
	 * @param goods_typeid ��Ʒ���ͱ��
	 * @param goods_desc ��Ʒ����
	 * @param good_state ��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
	 * @param user_id �û����
	 * @param goods_minpremium ��ͼӼ�
	 * @param goods_auctiontime ��Ʒ����ʱ�䣨��λ���죩
	 * @param goods_margin ��Ʒ���ı�֤��
	 * @param goods_create ����ʱ��
	 * @param goods_modified ����ʱ��
	 */
	public Goods(String goods_name, double goods_minprice, double goods_currentprice, double goods_getprice,
			int goods_typeid, String goods_desc, int good_state, int user_id, double goods_minpremium,
			int goods_auctiontime, double goods_margin, String goods_create, String goods_modified) {
		super();
		this.goods_name = goods_name;
		this.goods_minprice = goods_minprice;
		this.goods_currentprice = goods_currentprice;
		this.goods_getprice = goods_getprice;
		this.goods_typeid = goods_typeid;
		this.goods_desc = goods_desc;
		this.good_state = good_state;
		this.user_id = user_id;
		this.goods_minpremium = goods_minpremium;
		this.goods_auctiontime = goods_auctiontime;
		this.goods_margin = goods_margin;
		this.goods_create = goods_create;
		this.goods_modified = goods_modified;
	}


	/**
	 * ��������
	 * @param goods_id
	 * @param goods_name
	 * @param goods_minprice
	 * @param goods_currentprice
	 * @param goods_getprice
	 * @param goods_typeid
	 * @param goods_desc
	 * @param good_state
	 * @param user_id
	 * @param goods_minpremium
	 * @param goods_auctiontime
	 * @param goods_margin
	 * @param goods_create
	 * @param goods_modified
	 */
	public Goods(int goods_id, String goods_name, double goods_minprice, double goods_currentprice,
			double goods_getprice, int goods_typeid, String goods_desc, int good_state, int user_id,
			double goods_minpremium, int goods_auctiontime, double goods_margin, String goods_create,
			String goods_modified) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_minprice = goods_minprice;
		this.goods_currentprice = goods_currentprice;
		this.goods_getprice = goods_getprice;
		this.goods_typeid = goods_typeid;
		this.goods_desc = goods_desc;
		this.good_state = good_state;
		this.user_id = user_id;
		this.goods_minpremium = goods_minpremium;
		this.goods_auctiontime = goods_auctiontime;
		this.goods_margin = goods_margin;
		this.goods_create = goods_create;
		this.goods_modified = goods_modified;
	}


	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public double getGoods_minprice() {
		return goods_minprice;
	}
	public void setGoods_minprice(double goods_minprice) {
		this.goods_minprice = goods_minprice;
	}
	public double getGoods_currentprice() {
		return goods_currentprice;
	}
	public void setGoods_currentprice(double goods_currentprice) {
		this.goods_currentprice = goods_currentprice;
	}
	public double getGoods_getprice() {
		return goods_getprice;
	}
	public void setGoods_getprice(double goods_getprice) {
		this.goods_getprice = goods_getprice;
	}
	public int getGoods_typeid() {
		return goods_typeid;
	}
	public void setGoods_typeid(int goods_typeid) {
		this.goods_typeid = goods_typeid;
	}
	public String getGoods_desc() {
		return goods_desc;
	}
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}
	public int getGood_state() {
		return good_state;
	}
	public void setGood_state(int good_state) {
		this.good_state = good_state;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public double getGoods_minpremium() {
		return goods_minpremium;
	}
	public void setGoods_minpremium(double goods_minpremium) {
		this.goods_minpremium = goods_minpremium;
	}
	public int getGoods_auctiontime() {
		return goods_auctiontime;
	}
	public void setGoods_auctiontime(int goods_auctiontime) {
		this.goods_auctiontime = goods_auctiontime;
	}
	public double getGoods_margin() {
		return goods_margin;
	}
	public void setGoods_margin(double goods_margin) {
		this.goods_margin = goods_margin;
	}
	public String getGoods_create() {
		return goods_create;
	}
	public void setGoods_create(String goods_create) {
		this.goods_create = goods_create;
	}
	public String getGoods_modified() {
		return goods_modified;
	}
	public void setGoods_modified(String goods_modified) {
		this.goods_modified = goods_modified;
	}
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_minprice=" + goods_minprice
				+ ", goods_currentprice=" + goods_currentprice + ", goods_getprice=" + goods_getprice
				+ ", goods_typeid=" + goods_typeid + ", goods_desc=" + goods_desc + ", good_state=" + good_state
				+ ", user_id=" + user_id + ", goods_minpremium=" + goods_minpremium + ", goods_auctiontime="
				+ goods_auctiontime + ", goods_margin=" + goods_margin + ", goods_create=" + goods_create
				+ ", goods_modified=" + goods_modified + "]";
	}
	
	
}
