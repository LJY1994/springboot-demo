package cn.hitsz.bme.domain;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	private long userId;
	
	private String  user_real_name;
	
	private int user_age;
	
	private String user_gender;
	
	private float user_height;
	
	private float user_weight;
	
	private Date registerDate;
	
	
	public UserInfo(long id) {
		this.userId = id;
	}

	public UserInfo( ) {
 
	}
	
	public long getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getUser_real_name() {
		return user_real_name;
	}

	public void setUser_real_name(String user_real_name) {
		this.user_real_name = user_real_name;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public float getUser_height() {
		return user_height;
	}

	public void setUser_height(float user_height) {
		this.user_height = user_height;
	}

	public float getUser_weight() {
		return user_weight;
	}

	public void setUser_weight(float user_weight) {
		this.user_weight = user_weight;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

}
