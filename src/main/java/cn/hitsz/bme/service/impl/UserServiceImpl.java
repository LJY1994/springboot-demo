package cn.hitsz.bme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hitsz.bme.domain.UserLogined;
import cn.hitsz.bme.mapper.UserMapper;
import cn.hitsz.bme.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserLogined> findAllUser() {
		List<UserLogined> list = userMapper.findAllUser();
		return list;
	}

	@Override
	public List<UserLogined> findAUser(String userAccount) {
		UserLogined user = new UserLogined(userAccount, " ");
		List<UserLogined> list = userMapper.findAUser(user);
		return list;
	}

	@Override
	public List<UserLogined> findUser(String user) {
		List<UserLogined> list = userMapper.findUser(user);
		return list;
	}
	
	@Override
	public int register(String  account, String password) {
		List<UserLogined> list = userMapper.findUser(account);
		if(list!=null&&list.size()>0)
			return 101;
		return userMapper.register(account, password);
	}

	@Override
	public boolean updateAccount(UserLogined user) {
		return userMapper.updateAccount(user);
	}

	@Override
	public boolean deleteAccount(long userId) {
		return userMapper.deleteAccount(userId);
	}

}
