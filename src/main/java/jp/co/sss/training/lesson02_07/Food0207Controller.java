package jp.co.sss.training.lesson02_07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.FoodForm;
import jp.co.sss.training.repository.FoodRepository;

@Controller
public class Food0207Controller {
		
	@Autowired
	FoodRepository repository;
	
	@RequestMapping(path = "/lesson02_07/index")
	public String foodIndex(Model model) {
		model.addAttribute("foods", repository.findAll());
		return "lesson02_07/index";
	}
	@RequestMapping(path = "/lesson02_07/search", method = RequestMethod.POST)
	public String findByName(FoodForm form, Model model) {
		model.addAttribute("foods", repository.findByNameContaining(form.getName()));
		return "lesson02_07/index";
	}
}
