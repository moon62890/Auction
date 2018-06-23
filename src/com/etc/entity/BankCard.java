package com.etc.entity;

/**
 * ʵ���� ���п���
 * @author HongPeiQi
 *
 */
public class BankCard {

	private int bankcard_id; //��� ����
	private int user_id; //�û���� ���
	private String bankcard_number; //���п����� 
	private String bankcard_create; //����ʱ��
	private String bankcard_modified; //����ʱ��
	
	/**
	 * Ĭ�Ϲ���
	 */
	public BankCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ����ʱ���ù���
	 * @param user_id �û���� ���
	 * @param bankcard_number ���п����� 
	 * @param bankcard_create ����ʱ��
	 * @param bankcard_modified ����ʱ��
	 */
	public BankCard(int user_id, String bankcard_number, String bankcard_create, String bankcard_modified) {
		super();
		this.user_id = user_id;
		this.bankcard_number = bankcard_number;
		this.bankcard_create = bankcard_create;
		this.bankcard_modified = bankcard_modified;
	}
	
	/**
	 * ��������
	 * @param bankcard_id
	 * @param user_id
	 * @param bankcard_number
	 * @param bankcard_create
	 * @param bankcard_modified
	 */
	public BankCard(int bankcard_id, int user_id, String bankcard_number, String bankcard_create,
			String bankcard_modified) {
		super();
		this.bankcard_id = bankcard_id;
		this.user_id = user_id;
		this.bankcard_number = bankcard_number;
		this.bankcard_create = bankcard_create;
		this.bankcard_modified = bankcard_modified;
	}
	public int getBankcard_id() {
		return bankcard_id;
	}
	public void setBankcard_id(int bankcard_id) {
		this.bankcard_id = bankcard_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getBankcard_number() {
		return bankcard_number;
	}
	public void setBankcard_number(String bankcard_number) {
		this.bankcard_number = bankcard_number;
	}
	public String getBankcard_create() {
		return bankcard_create;
	}
	public void setBankcard_create(String bankcard_create) {
		this.bankcard_create = bankcard_create;
	}
	public String getBankcard_modified() {
		return bankcard_modified;
	}
	public void setBankcard_modified(String bankcard_modified) {
		this.bankcard_modified = bankcard_modified;
	}
	@Override
	public String toString() {
		return "BankCard [bankcard_id=" + bankcard_id + ", user_id=" + user_id + ", bankcard_number=" + bankcard_number
				+ ", bankcard_create=" + bankcard_create + ", bankcard_modified=" + bankcard_modified + "]";
	}
	
	
	
}
