package jp.co.sss.training.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User0501Form {
	
	@Size(min = 1, max = 10, message = "1文字以上10文字以下で入力してください")
	@Pattern(regexp = "[a-z][a-z0-9]*", message = "小文字アルファベットまたは数字を入力してください。先頭に数字は使えません")
	private String userId;

	@Size(min = 1, max = 10, message = "1文字以上10文字以下で入力してください")
	@Pattern(regexp = "[a-z][a-z0-9]*", message = "小文字アルファベットまたは数字を入力してください。先頭に数字は使えません")
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
