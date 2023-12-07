package jp.co.sss.training.lesson01_05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Input0105Controller {

	@RequestMapping(path = "/lesson01_05/getform", method = RequestMethod.GET)
	public String getform() {
		return "lesson01_05/getform";
	}
	
	@RequestMapping(path = "/lesson01_05/doGetform", method = RequestMethod.GET)
	public String doGetform(String inputstr) {
		System.out.println("ユーザ ID:" + inputstr);
		return "lesson01_05/getform";
	}
}
