package com.etc.entity;

/**
 * ʵ���� �ջ���ַ�� 
 * @author HongPeiQi
 *
 */
public class ShoppingAddress {

	private int address_id; //��ַ��� ����
	private int user_id; //�ļ��˱��
	private String consignee_name; //�ջ�������
	private String consignee_tel; //�ջ��˵绰
	private String consignee_address; //�ջ��˵�ַ
	private String address_create;//����ʱ��
	private String address_modified;//����ʱ��
	
	
	/**
	 * Ĭ�Ϲ���
	 */
	public ShoppingAddress() {
		super();
	}
	
	/**
	 * ����ʱ���ù���		
	 * @param user_id �ļ��˱��
	 * @param consignee_name �ջ�������
	 * @param consignee_tel �ջ��˵绰
	 * @param consignee_address �ջ��˵�ַ
	 * @param address_create ����ʱ��
	 * @param address_modified ����ʱ��
	 */
	public ShoppingAddress(int user_id, String consignee_name, String consignee_tel, String consignee_address,
			String address_create, String address_modified) {
		super();
		this.user_id = user_id;
		this.consignee_name = consignee_name;
		this.consignee_tel = consignee_tel;
		this.consignee_address = consignee_address;
		this.address_create = address_create;
		this.address_modified = address_modified;
	}


	/**
	 * ��������
	 * @param address_id
	 * @param user_id
	 * @param consignee_name
	 * @param consignee_tel
	 * @param consignee_address
	 * @param address_create
	 * @param address_modified
	 */
	public ShoppingAddress(int address_id, int user_id, String consignee_name, String consignee_tel,
			String consignee_address, String address_create, String address_modified) {
		super();
		this.address_id = address_id;
		this.user_id = user_id;
		this.consignee_name = consignee_name;
		this.consignee_tel = consignee_tel;
		this.consignee_address = consignee_address;
		this.address_create = address_create;
		this.address_modified = address_modified;
	}

	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getConsignee_name() {
		return consignee_name;
	}
	public void setConsignee_name(String consignee_name) {
		this.consignee_name = consignee_name;
	}
	public String getConsignee_tel() {
		return consignee_tel;
	}
	public void setConsignee_tel(String consignee_tel) {
		this.consignee_tel = consignee_tel;
	}
	public String getConsignee_address() {
		return consignee_address;
	}
	public void setConsignee_address(String consignee_address) {
		this.consignee_address = consignee_address;
	}
	public String getAddress_create() {
		return address_create;
	}
	public void setAddress_create(String address_create) {
		this.address_create = address_create;
	}
	public String getAddress_modified() {
		return address_modified;
	}
	public void setAddress_modified(String address_modified) {
		this.address_modified = address_modified;
	}
	@Override
	public String toString() {
		return "ShoppingAddress [address_id=" + address_id + ", user_id=" + user_id + ", consignee_name="
				+ consignee_name + ", consignee_tel=" + consignee_tel + ", consignee_address=" + consignee_address
				+ ", address_create=" + address_create + ", address_modified=" + address_modified + "]";
	}
	
	
	
	
}
