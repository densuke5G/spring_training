package jp.co.sss.training.bean;

import java.io.Serializable;

public class Userbean implements Serializable {
	private Integer id;
	private String userId;
	private String password;
	
	public Userbean() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
