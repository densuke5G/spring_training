package jp.co.sss.training.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User0502Form {
	
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[a-z][a-z0-9]*")
	private String userId;

	@Size(min = 1, max = 10)
	@Pattern(regexp = "[a-z][a-z0-9]*")
	private String password;

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
