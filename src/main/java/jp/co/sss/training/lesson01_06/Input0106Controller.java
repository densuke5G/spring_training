package jp.co.sss.training.lesson01_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Input0106Controller {

	@RequestMapping(path = "/lesson01_06/postForm", method = RequestMethod.GET)
	public String postForm() {
		return "lesson01_06/postForm";
	}
	
	@RequestMapping(path = "/lesson01_06/input", method = RequestMethod.POST)
	public String doPostForm(String inputstr) {
		System.out.println("ユーザ ID:" + inputstr);
		return "lesson01_06/postForm";
	}
}
