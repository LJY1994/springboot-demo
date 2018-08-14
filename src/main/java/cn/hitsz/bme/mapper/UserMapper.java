package cn.hitsz.bme.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.hitsz.bme.domain.UserInfo;
import cn.hitsz.bme.domain.UserLogined;

@Mapper
public interface UserMapper {
	/*
	 * 登录验证
	 */
	public List<UserLogined> findAllUser();
	
	public List<UserLogined> findAUser(UserLogined user);	
	
	public List<UserLogined> findUser(@Param("user")String user);	
	
	public int register(@Param("account")String account, @Param("password")String password);
	
	public boolean deleteAccount(long userId);
	
	public boolean updateAccount(UserLogined user);
	/*
	 * 获取个人信息
	 */
	public List<UserInfo> getUserInfo();

	

	
}
