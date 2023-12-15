package jp.co.sss.training.lesson07_02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index0702Controller {
	
	@RequestMapping(path = "/lesson07_02/index")
	public String doIndex(String word, Model model) {
		if (word == null || word.length() == 0) {
			model.addAttribute("noword", "検索キーワードを入力してください");
			
		}else {
			model.addAttribute("word", word);
			
		}
		return "lesson07_02/index";
	}
}
