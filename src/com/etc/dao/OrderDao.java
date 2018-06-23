package com.etc.dao;

import java.util.List;

import com.etc.entity.Order;

/**
 * ӆ�����Pdao
 * 
 * @author HongPeiQi
 *
 */
public interface OrderDao {

	/**
	 * ���ӆ��
	 * 
	 * @param order
	 * @return True �ɹ� False ʧ��
	 */
	public boolean addOrder(Order order);

	/**
	 * �����Ñ���̖->��ԃ����ӆ��
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @return List
	 */
	public List<Order> queryOrderByUserId(int user_id);

	/**
	 * ����ӆ�Π�B->��ԃ�Ñ�����ӆ��
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @param orderstate
	 *            ӆ�Π�B
	 * @return List
	 */
	public List<Order> queryOrderByUserIdAndState(int user_id, int orderstate);

	/**
	 * ����ӆ�Π�B->��ԃ����ӆ��
	 * 
	 * @param orderstate
	 *            ӆ�Π�B
	 * @return List
	 */
	public List<Order> queryOrderByState(int orderstate);

	/**
	 * ����������->��ԃ����ӆ��
	 * 
	 * @param order_date
	 *            ������
	 * @return List
	 */
	public List<Order> queryOrderByOrderDate(String order_date);

	/**
	 * ����������->��ԃ�Ñ�����ӆ��
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @param order_date
	 *            ������
	 * @return
	 */
	public List<Order> queryOrderByUserAndOrderDate(int user_id, String order_date);

	/**
	 * ����ӆ�ξ�̖->��ԃԔ���Y��
	 * 
	 * @param order_id
	 * @return
	 */
	public Order queryOrderByOrderId(int order_id);

	/**
	 * ����ӆ��
	 * 
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Order order);

	/**
	 * �Ñ�����oƽ̨
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @param money
	 *            ���~
	 * @param order_id
	 *            ӆ�ξ�̖
	 * @return
	 */
	public boolean payForPlatfrom(int user_id, double money, int order_id);

	/**
	 * ƽ̨����o�Ñ�
	 * @param user_id
	 * @param money
	 * @return
	 */
	public boolean payForSeller(int user_id, double money);

}
