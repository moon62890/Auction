package com.etc.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.etc.dao.AddressDao;
import com.etc.dao.UserDao;
import com.etc.entity.ShoppingAddress;
import com.etc.entity.Users;

public class TestMyBatisAddress_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			
			try {
				AddressDao addressDao =sqlSession.getMapper(AddressDao.class);	
								
				boolean flag = addressDao.deleteAddress(34);
				
				System.out.println(flag);
				
				sqlSession.commit();
				
			
			}finally {
				
				sqlSession.close();
			}
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
