package com.etc.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.etc.dao.AddressDao;
import com.etc.dao.BankDao;
import com.etc.dao.UserDao;
import com.etc.entity.BankCard;
import com.etc.entity.ShoppingAddress;
import com.etc.entity.Users;

public class TestMyBatisBank_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			
			try {
				BankDao bankDao =sqlSession.getMapper(BankDao.class);	
				BankCard bankCard = new BankCard();
				bankCard.setUser_id(1);
				bankCard.setBankcard_number("12345678911");

				boolean flag = bankDao.addBankCard(bankCard);
				
				System.out.println(flag);
				
				sqlSession.commit();
				
				System.out.println(bankCard.getBankcard_id());
			
			}finally {
				
				sqlSession.close();
			}
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
