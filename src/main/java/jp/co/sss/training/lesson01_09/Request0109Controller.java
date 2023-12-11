package jp.co.sss.training.lesson01_09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Request0109Controller {
	
	@RequestMapping(path = "/lesson01_09/input", method = RequestMethod.GET)
	public String inputOnRequest() {
		return "lesson01_09/input";
	}
	@RequestMapping(path = "/lesson01_09/result", method = RequestMethod.GET)
	public String doInputOnRequest(String keyword, Model model) {
		model.addAttribute("keyword", keyword);
		return "lesson01_09/result";
	}
}
