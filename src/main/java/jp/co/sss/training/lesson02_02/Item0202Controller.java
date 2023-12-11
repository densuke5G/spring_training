package jp.co.sss.training.lesson02_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.repository.ItemRepository;

@Controller
public class Item0202Controller {
	
	@Autowired
	ItemRepository repository;
	
	@RequestMapping("/lesson02_02/index")
	public String findOrder(Model model) {
		model.addAttribute("Items", repository.findAllByOrderByPriceAsc());
		return "lesson02_02/index";
	}
}
