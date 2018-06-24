package com.etc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.dao.OrderDao;
import com.etc.entity.Order;

/**
 * ”ÜÜŒœ‡ÍPòIÑ’dao åç¨FÓê
 * @author HongPeiQi
 *
 */
@Repository(value="orderDao")
public class OrderDaoImpl implements OrderDao {

	@Override
	public boolean addOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> queryOrderByUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByUserIdAndState(int user_id, int orderstate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByState(int orderstate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByOrderDate(String order_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByUserAndOrderDate(int user_id, String order_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order queryOrderByOrderId(int order_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payForPlatfrom(int user_id, double money, int order_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payForSeller(int user_id, double money) {
		// TODO Auto-generated method stub
		return false;
	}

}
