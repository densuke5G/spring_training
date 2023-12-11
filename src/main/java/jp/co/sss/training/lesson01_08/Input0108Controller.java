package jp.co.sss.training.lesson01_08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller
public class Input0108Controller {
	@RequestMapping(path = "/lesson01_08/top")
	public String top() {
		return "lesson01_08/top";
	}

	@RequestMapping(path = "/lesson01_08/login", method = RequestMethod.GET)
	public String login() {
		return "lesson01_08/login";
	}
	
	@RequestMapping(path = "/lesson01_08/login", method = RequestMethod.POST)
	public String doLogin(LoginForm loginForm) {
		if (loginForm.getUserId() == "" || loginForm.getPassword() == "") {
			return "lesson01_08/login";
			
		}	else if (loginForm.getUserId().equals(loginForm.getPassword())) {
			return "redirect:/lesson01_08/top";
			
		} else {
			return "lesson01_08/login";
			
		}
	}
}
