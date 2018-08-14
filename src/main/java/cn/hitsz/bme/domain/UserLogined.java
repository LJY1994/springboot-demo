package cn.hitsz.bme.domain;

import java.io.Serializable;


public class UserLogined implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private long userId;
	
	private String userAccount;
	
	private String userPassword;
	
	private String name;
	
	private String email;
	
	private int userType;

	public UserLogined(String userAccount, String userPassword) {
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}

	public UserLogined() {

	}
	
	public long getId() {
		return userId;
	}

	public void setId(long id) {
		this.userId = id;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
