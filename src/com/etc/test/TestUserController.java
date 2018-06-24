package com.etc.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.entity.Users;
import com.etc.service.UserService;
import com.etc.util.PageData;


@Controller
@RequestMapping("/api")
public class TestUserController {
	
	Logger logger = Logger.getLogger(TestUserController.class);
	
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
	public PageData<Users> queryUser(@RequestParam(value="pageNo") Integer pageNo,@RequestParam(value="pageSize") Integer pageSize){
	
		logger.info("queryUser");
		return userService.queryUsers(pageNo, pageSize, null);	
	}
	
	@RequestMapping(value="/users/{user_id}",method=RequestMethod.GET)
	@ResponseBody
	public Users queryUsersById(@PathVariable(value="user_id") int user_id) {
			
		return userService.queryUsersById(user_id);
	}
	
	@RequestMapping(value="/users/queryByName",method=RequestMethod.GET)
	@ResponseBody
	public List<Users> queryUsersByName(@RequestParam(value="user_realName") String user_realName){
				
		return userService.queryUsersByName(user_realName);		
	}
	
	@RequestMapping(value="/users/queryByState",method=RequestMethod.GET)
	@ResponseBody
	public PageData<Users> queryUserByState(@RequestParam(value="pageNo") Integer pageNo,@RequestParam(value="pageSize") Integer pageSize, @RequestParam(value="user_state") int user_state){
		return userService.queryUserByState(pageNo, pageSize, user_state);		
	}
	
}
