package jp.co.sss.training.lesson02_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0201Controller {
	
	@Autowired
	TrainingUserRepository repository;
	
	@RequestMapping("/lesson02_01/index")
	public String findAll(Model model) {
		model.addAttribute("TrainingUsers", repository.findAll());
		return "lesson02_01/index";
	}
}
