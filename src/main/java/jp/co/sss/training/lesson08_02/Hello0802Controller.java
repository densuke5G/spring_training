package jp.co.sss.training.lesson08_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello0802Controller {
	@RequestMapping(path = "/lesson08_02/Hello")
	public String hello() {
		return "lesson08_02/Hello";
	}
}
