package jp.co.sss.training.lesson01_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Input0107Controller {
	@RequestMapping(path = "/lesson01_07/top")
	public String top() {
		return "lesson01_07/top";
	}

	@RequestMapping(path = "/lesson01_07/login", method = RequestMethod.GET)
	public String login() {
		return "lesson01_07/login";
	}
	
	@RequestMapping(path = "/lesson01_07/login", method = RequestMethod.POST)
	public String doLogin(String userId, String password) {
		if (userId == "" || password == "") {
			return "lesson01_07/login";
			
		} else if (userId.equals(password)) {
			return "redirect:/lesson01_07/top";
			
		} else {
			return "lesson01_07/login";
			
		}
	}
}
