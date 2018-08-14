package cn.hitsz.bme.service;

import java.util.List;

import cn.hitsz.bme.domain.UserLogined;

public interface UserService {
	/**
	 * 根据接口查询所用的用户注册信息
	 */
	public List<UserLogined> findAllUser();
	
	public List<UserLogined> findAUser(String userAccount);
	
	public List<UserLogined> findUser(String user);
	/**
	 * 新注册
	 * 返回 101 表示已存在；
	 * 
	 * 返回 1 表示成功注册；
	 * 返回 0 注册失败；
	 */
	public int register(String account, String password);
	
	public boolean updateAccount(UserLogined user);
	
	public boolean deleteAccount(long userId);
}
