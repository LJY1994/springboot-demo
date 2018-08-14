package cn.hitsz.bme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hitsz.bme.domain.UserLogined;
import cn.hitsz.bme.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("info")
	public UserLogined showUser(){
		
		UserLogined user = new UserLogined("zsf", "zsf");
		
		user.setName("张三丰");
		user.setUserType(1);

		return user;
	}
	
	@RequestMapping("hello")
	public String hello(){
		return "Hello";
	}
	
	@RequestMapping("list")
	public List<UserLogined> findAll(){
		
		List<UserLogined> users = userService.findAllUser();
		/*
		List<UserLogined> users = new ArrayList<>();*/
		UserLogined user = new UserLogined("zsf", "zsf");
		
		user.setName("张三丰");
		user.setUserType(1);
		users.add(user);
		
		return users;
	}
	
	@RequestMapping("host")
	public List<UserLogined> findHost(){
		/*
		List<UserLogined> users = new ArrayList<>();*/
		
		List<UserLogined> users = userService.findAUser("ljy");
		return users;
	}
	
	@RequestMapping("register")
	public int register(String account, String password){
		String userAccount = "lxm";
		String userPassword = "lxm";
		int success = userService.register(userAccount, userPassword);
		return success;
	}
	
	@RequestMapping("update")
	public boolean updateUser(){
		String userAccount = "lxm";
		String userPassword = "lxm";
		UserLogined newU = new UserLogined(userAccount, userPassword);
		newU.setEmail("34564853@qq.com");
		newU.setName("连连");
		newU.setUserType(0);
		boolean success = userService.updateAccount(newU);
		return success;
	}
	
	@RequestMapping("delete")
	public boolean deleteUser(){
		String userAccount = "lxm";
		String userPassword = "lxm";
		boolean success = false;
		List<UserLogined> list = userService.findAUser(userAccount);
		System.out.println(list.toString());
		if(list == null||list.size()<1) 
			return success;
		for (UserLogined userLogined : list) {
			if(userLogined.getUserAccount().equals(userAccount)
				&&userLogined.getUserPassword().equals(userPassword)){
					System.out.println(userLogined.getName()+" "+userLogined.getId());
					success = userService.deleteAccount(userLogined.getId());
					break;
				}
		}
		return success;
	}
}
