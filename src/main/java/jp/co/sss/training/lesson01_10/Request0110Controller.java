package jp.co.sss.training.lesson01_10;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Request0110Controller {
	
	@RequestMapping(path = "/lesson01_10/top", method = RequestMethod.GET)
	public String top() {
		return "lesson01_10/top";
	}
	@RequestMapping(path = "/lesson01_10/login", method = RequestMethod.GET)
	public String login() {
		return "lesson01_10/login";
	}
	@RequestMapping(path = "/lesson01_10/doLogin", method = RequestMethod.POST)
	public String doLogin(String userId, String password, HttpSession session) {
		if (userId == "" || password == "") {
			return "lesson01_10/login";
			
		} else if (userId.equals(password)){
			session.setAttribute("userId", userId);
			session.setAttribute("password", password);
			return "redirect:/lesson01_10/top";
			
		} else {
			return "lesson01_10/login";
			
		}
	}
	@RequestMapping(path = "/lesson01_10/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "lesson01_10/login";
	}
}
