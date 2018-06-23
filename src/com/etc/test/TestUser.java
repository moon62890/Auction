package com.etc.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.entity.Users;
import com.etc.service.UserService;


@Controller
@RequestMapping("/api")
public class TestUser {
	
	Logger logger = Logger.getLogger(TestUser.class);
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	@ResponseBody
	public boolean addUser(@RequestBody Users user) {
		
		logger.info("addUser");
		return userService.addUser(user);
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	@ResponseBody
	public List<Users> queryUser(){
		
		logger.info("queryUser");
		return userService.queryUsers();
		
	}
	
}
