package com.etc.entity;

/**
 * ʵ���� ��ƷͼƬ��
 * @author HongPeiQi
 *
 */
public class GoodsImg {
	
	private int goodsimg_id; //��� ����
	private int goods_id; //��Ʒ��� ���
	private String goodsimg_src; //��Ƭ��ַ
	private String goodsimg_create; //����ʱ��
	private String goodsimg_modified; //����ʱ��
	
	/**
	 * Ĭ�Ϲ���
	 */
	public GoodsImg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ����ʱ���ù���
	 * @param goods_id ��Ʒ��� ���
	 * @param goodsimg_src ��Ƭ��ַ
	 * @param goodsimg_create ����ʱ��
	 * @param goodsimg_modified ����ʱ��
	 */
	public GoodsImg(int goods_id, String goodsimg_src, String goodsimg_create, String goodsimg_modified) {
		super();
		this.goods_id = goods_id;
		this.goodsimg_src = goodsimg_src;
		this.goodsimg_create = goodsimg_create;
		this.goodsimg_modified = goodsimg_modified;
	}
	
	/**
	 * ��������
	 * @param goodsimg_id
	 * @param goods_id
	 * @param goodsimg_src
	 * @param goodsimg_create
	 * @param goodsimg_modified
	 */
	public GoodsImg(int goodsimg_id, int goods_id, String goodsimg_src, String goodsimg_create,
			String goodsimg_modified) {
		super();
		this.goodsimg_id = goodsimg_id;
		this.goods_id = goods_id;
		this.goodsimg_src = goodsimg_src;
		this.goodsimg_create = goodsimg_create;
		this.goodsimg_modified = goodsimg_modified;
	}
	public int getGoodsimg_id() {
		return goodsimg_id;
	}
	public void setGoodsimg_id(int goodsimg_id) {
		this.goodsimg_id = goodsimg_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoodsimg_src() {
		return goodsimg_src;
	}
	public void setGoodsimg_src(String goodsimg_src) {
		this.goodsimg_src = goodsimg_src;
	}
	public String getGoodsimg_create() {
		return goodsimg_create;
	}
	public void setGoodsimg_create(String goodsimg_create) {
		this.goodsimg_create = goodsimg_create;
	}
	public String getGoodsimg_modified() {
		return goodsimg_modified;
	}
	public void setGoodsimg_modified(String goodsimg_modified) {
		this.goodsimg_modified = goodsimg_modified;
	}
	@Override
	public String toString() {
		return "GoodsImg [goodsimg_id=" + goodsimg_id + ", goods_id=" + goods_id + ", goodsimg_src=" + goodsimg_src
				+ ", goodsimg_create=" + goodsimg_create + ", goodsimg_modified=" + goodsimg_modified + "]";
	}
	
}
