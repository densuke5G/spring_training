package jp.co.sss.training.lesson07_03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index0703Controller {
	Integer count = 3;
	
	@RequestMapping(path = "/lesson07_03/index")
	public String doIndex(HttpSession session) {
		count++;
		session.setAttribute("count", count);
		return "lesson07_03/index";
	}
}
