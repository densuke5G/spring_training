package jp.co.sss.training.lesson07_01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index0701Controller {
	
	
	@RequestMapping(path = "/lesson07_01/index")
	public String index(Model model) {
		model.addAttribute("message", "処理が完了しました");
		model.addAttribute("messageClass", "information");
		return "lesson07_01/index";
	}
}
