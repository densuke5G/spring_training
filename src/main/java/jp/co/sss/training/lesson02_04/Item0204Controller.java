package jp.co.sss.training.lesson02_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.repository.ItemRepository;

@Controller
public class Item0204Controller {

	@Autowired
	ItemRepository repository;

	@RequestMapping("/lesson02_04/index")
	public String findOrder(Model model) {
		model.addAttribute("Items", repository.findAllByOrderByPriceAsc());
		return "lesson02_04/index";
	}

	@RequestMapping("/lesson02_04/index/{price}/{genreId}")
	public String findByPriceAndGenreId(@PathVariable Integer price, @PathVariable Integer genreId, Model model) {
		model.addAttribute("Items", repository.findByPriceAndGenreId(price, genreId));
		return "lesson02_04/index";
	}
}
