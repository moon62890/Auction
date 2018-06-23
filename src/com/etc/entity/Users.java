package com.etc.entity;

/**
 * 实体类 用户信息表
 * @author HongPeiQi
 *
 */
public class Users {
	
	private int uesr_id; //编号 自增
	private String uesr_acc; //账号
	private String uesr_pwd; //密码
	private String user_email; //邮箱
	private String uesr_tel; //电话
	private String user_realname; //真实姓名
	private String uesr_cardid; //身份证号码
	private String user_address; //用户地址
	private double user_balance; //用戶餘額
	private int user_state; //用户状态(0启用1停权)
	private String user_create; //新增时间
	private String user_modified; //更新时间
	
	
	/**
	 * 默认构造
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造
	 * @param uesr_acc 账号
	 * @param uesr_pwd 密码
	 * @param user_email 邮箱
	 * @param uesr_tel 电话
	 * @param user_realname 真实姓名
	 * @param uesr_cardid 身份证号码
	 * @param user_address 用户地址
	 * @param user_balance 用戶餘額
	 * @param user_state 用户状态(0启用1停权)
	 * @param user_create 新增时间
	 * @param user_modified 更新时间
	 */
	public Users(String uesr_acc, String uesr_pwd, String user_email, String uesr_tel, String user_realname,
			String uesr_cardid, String user_address, double user_balance, int user_state, String user_create,
			String user_modified) {
		super();
		this.uesr_acc = uesr_acc;
		this.uesr_pwd = uesr_pwd;
		this.user_email = user_email;
		this.uesr_tel = uesr_tel;
		this.user_realname = user_realname;
		this.uesr_cardid = uesr_cardid;
		this.user_address = user_address;
		this.user_balance = user_balance;
		this.user_state = user_state;
		this.user_create = user_create;
		this.user_modified = user_modified;
	}
	
	/**
	 * 完整构造
	 * @param uesr_id
	 * @param uesr_acc
	 * @param uesr_pwd
	 * @param user_email
	 * @param uesr_tel
	 * @param user_realname
	 * @param uesr_cardid
	 * @param user_address
	 * @param user_balance
	 * @param user_state
	 * @param user_create
	 * @param user_modified
	 */
	public Users(int uesr_id, String uesr_acc, String uesr_pwd, String user_email, String uesr_tel,
			String user_realname, String uesr_cardid, String user_address, double user_balance, int user_state,
			String user_create, String user_modified) {
		super();
		this.uesr_id = uesr_id;
		this.uesr_acc = uesr_acc;
		this.uesr_pwd = uesr_pwd;
		this.user_email = user_email;
		this.uesr_tel = uesr_tel;
		this.user_realname = user_realname;
		this.uesr_cardid = uesr_cardid;
		this.user_address = user_address;
		this.user_balance = user_balance;
		this.user_state = user_state;
		this.user_create = user_create;
		this.user_modified = user_modified;
	}
	public int getUesr_id() {
		return uesr_id;
	}
	public void setUesr_id(int uesr_id) {
		this.uesr_id = uesr_id;
	}
	public String getUesr_acc() {
		return uesr_acc;
	}
	public void setUesr_acc(String uesr_acc) {
		this.uesr_acc = uesr_acc;
	}
	public String getUesr_pwd() {
		return uesr_pwd;
	}
	public void setUesr_pwd(String uesr_pwd) {
		this.uesr_pwd = uesr_pwd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUesr_tel() {
		return uesr_tel;
	}
	public void setUesr_tel(String uesr_tel) {
		this.uesr_tel = uesr_tel;
	}
	public String getUser_realname() {
		return user_realname;
	}
	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}
	public String getUesr_cardid() {
		return uesr_cardid;
	}
	public void setUesr_cardid(String uesr_cardid) {
		this.uesr_cardid = uesr_cardid;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public double getUser_balance() {
		return user_balance;
	}
	public void setUser_balance(double user_balance) {
		this.user_balance = user_balance;
	}
	public int getUser_state() {
		return user_state;
	}
	public void setUser_state(int user_state) {
		this.user_state = user_state;
	}
	public String getUser_create() {
		return user_create;
	}
	public void setUser_create(String user_create) {
		this.user_create = user_create;
	}
	public String getUser_modified() {
		return user_modified;
	}
	public void setUser_modified(String user_modified) {
		this.user_modified = user_modified;
	}
	@Override
	public String toString() {
		return "Users [uesr_id=" + uesr_id + ", uesr_acc=" + uesr_acc + ", uesr_pwd=" + uesr_pwd + ", user_email="
				+ user_email + ", uesr_tel=" + uesr_tel + ", user_realname=" + user_realname + ", uesr_cardid="
				+ uesr_cardid + ", user_address=" + user_address + ", user_balance=" + user_balance + ", user_state="
				+ user_state + ", user_create=" + user_create + ", user_modified=" + user_modified + "]";
	}
}
