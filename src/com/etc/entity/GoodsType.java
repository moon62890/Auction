package com.etc.entity;

/**
 * ʵ���� ��Ʒ���ͱ�
 * @author HongPeiQi
 *
 */
public class GoodsType {
	
	private int goodstype_id; //��� ����
	private String goodstype_desc; //��������
	private String goodstype_create; //����ʱ��
	private String goodstype_modified; //����ʱ��
	
	/**
	 * Ĭ�Ϲ���
	 */
	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ����ʱ���ù���	
	 * @param goodstype_desc ��������
	 * @param goodstype_create ����ʱ��
	 * @param goodstype_modified ����ʱ��
	 */
	public GoodsType(String goodstype_desc, String goodstype_create, String goodstype_modified) {
		super();
		this.goodstype_desc = goodstype_desc;
		this.goodstype_create = goodstype_create;
		this.goodstype_modified = goodstype_modified;
	}
	
	/**
	 * ��������
	 * @param goodstype_id
	 * @param goodstype_desc
	 * @param goodstype_create
	 * @param goodstype_modified
	 */
	public GoodsType(int goodstype_id, String goodstype_desc, String goodstype_create, String goodstype_modified) {
		super();
		this.goodstype_id = goodstype_id;
		this.goodstype_desc = goodstype_desc;
		this.goodstype_create = goodstype_create;
		this.goodstype_modified = goodstype_modified;
	}
	public int getGoodstype_id() {
		return goodstype_id;
	}
	public void setGoodstype_id(int goodstype_id) {
		this.goodstype_id = goodstype_id;
	}
	public String getGoodstype_desc() {
		return goodstype_desc;
	}
	public void setGoodstype_desc(String goodstype_desc) {
		this.goodstype_desc = goodstype_desc;
	}
	public String getGoodstype_create() {
		return goodstype_create;
	}
	public void setGoodstype_create(String goodstype_create) {
		this.goodstype_create = goodstype_create;
	}
	public String getGoodstype_modified() {
		return goodstype_modified;
	}
	public void setGoodstype_modified(String goodstype_modified) {
		this.goodstype_modified = goodstype_modified;
	}
	
	@Override
	public String toString() {
		return "GoodsType [goodstype_id=" + goodstype_id + ", goodstype_desc=" + goodstype_desc + ", goodstype_create="
				+ goodstype_create + ", goodstype_modified=" + goodstype_modified + "]";
	}

}
