package com.etc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.etc.dao.UserDao;
import com.etc.entity.Users;
import com.etc.test.TestUserController;
import com.etc.util.PageData;
import com.etc.util.PageHandle;

/**
 * 用戶相關dao實現類
 * 
 * @author HongPeiQi
 *
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

	Logger logger = Logger.getLogger(UserDaoImpl.class);

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into users values(null,?,?,null,?,null,null,null,null,?,now(),null)",
				user.getUser_acc(), user.getUser_pwd(), user.getUser_tel(), 0) > 0;
	}

	@Override
	public boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PageData<Users> queryUsers(Integer pageNo, Integer pageSize, Object... param) {
		// TODO Auto-generated method stub

		String newSql = PageHandle.getPageSql("select * from users", pageNo, pageSize);

		List<Users> list = null;
		List<Users> totalList = null;

		if (param == null || param.length <= 0) {
			// 查詢總頁數
			totalList = jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));
			list = jdbcTemplate.query(newSql, new BeanPropertyRowMapper<Users>(Users.class));
		} else {
			// 查詢總頁數
			totalList = jdbcTemplate.query("select * from users", param, new BeanPropertyRowMapper<Users>(Users.class));
			list = jdbcTemplate.query(newSql, param, new BeanPropertyRowMapper<Users>(Users.class));
		}
		// 總頁數
		Integer count = totalList.size();

		// 创建一个PageData对象
		PageData<Users> page = new PageData<Users>(list, count, pageSize, pageNo);

		return page;
	}

	@Override
	public Users queryUsersById(int user_id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from users where user_id=?", new Object[] { user_id },
				new RowMapper<Users>() {
					@Override
					public Users mapRow(ResultSet rs, int arg1) throws SQLException {
						// TODO Auto-generated method stub
						Users users = new Users();
						users.setUser_id(rs.getInt("user_id"));
						users.setUser_acc(rs.getString("user_acc"));
						users.setUser_pwd(rs.getString("user_pwd"));
						users.setUser_tel(rs.getString("user_tel"));
						users.setUser_email(rs.getString("user_email"));
						users.setUser_balance(rs.getDouble("user_balance"));
						users.setUser_realname(rs.getString("user_realname"));
						users.setUser_state(rs.getInt("user_state"));
						users.setUser_cardid(rs.getString("user_cardid"));
						users.setUser_address(rs.getString("user_address"));
						users.setUser_create(rs.getString("user_create"));
						users.setUser_modified(rs.getString("user_modified"));

						return users;
					}
				});
	}

	@Override
	public List<Users> queryUsersByName(String user_realName) {
		// TODO Auto-generated method stub
		String sql = "select * from users where user_realName like '%" + user_realName + "%'";
		logger.info("sql=" + sql);
		return jdbcTemplate.query(sql, new RowMapper<Users>() {
			@Override
			public Users mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Users users = new Users();
				users.setUser_id(rs.getInt("user_id"));
				users.setUser_acc(rs.getString("user_acc"));
				users.setUser_pwd(rs.getString("user_pwd"));
				users.setUser_tel(rs.getString("user_tel"));
				users.setUser_email(rs.getString("user_email"));
				users.setUser_balance(rs.getDouble("user_balance"));
				users.setUser_realname(rs.getString("user_realname"));
				users.setUser_state(rs.getInt("user_state"));
				users.setUser_cardid(rs.getString("user_cardid"));
				users.setUser_address(rs.getString("user_address"));
				users.setUser_create(rs.getString("user_create"));
				users.setUser_modified(rs.getString("user_modified"));

				return users;
			}
		});
	}

	@Override
	public PageData<Users> queryUserByState(Integer pageNo, Integer pageSize, int user_state) {
		// TODO Auto-generated method stub
		String newSql = PageHandle.getPageSql("select * from users where user_state="+user_state, pageNo, pageSize);

		List<Users> list = null;
		List<Users> totalList = null;
		// 查詢總頁數
		totalList = jdbcTemplate.query("select * from users where user_state=?", new Object[] {user_state}, new BeanPropertyRowMapper<Users>(Users.class));
		list = jdbcTemplate.query(newSql,new Object[] {user_state}, new BeanPropertyRowMapper<Users>(Users.class));

		// 總頁數
		Integer count = totalList.size();

		// 创建一个PageData对象
		PageData<Users> page = new PageData<Users>(list, count, pageSize, pageNo);

		return page;
	}

}
