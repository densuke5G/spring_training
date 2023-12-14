package jp.co.sss.training.lesson02_10;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.bean.FoodBean;
import jp.co.sss.training.entity.Food;
import jp.co.sss.training.form.FoodForm;
import jp.co.sss.training.repository.FoodRepository;

@Controller
public class Food0210Controller {

	@Autowired
	FoodRepository repository;

	@RequestMapping(path = "/lesson02_10/index")
	public String foodIndex(Model model) {
		model.addAttribute("foods", repository.findAll());
		return "lesson02_10/index";
	}

	@RequestMapping(path = "/lesson02_10/complete")
	public String complete() {
		return "lesson02_10/complete";
	}

	@RequestMapping(path = "/lesson02_10/insert", method = RequestMethod.GET)
	public String insertFood() {
		return "lesson02_10/insert_input";
	}

	@RequestMapping(path = "/lesson02_10/insert", method = RequestMethod.POST)
	public String doInsertFood(FoodForm form) {
		Food food = new Food();
		BeanUtils.copyProperties(form, food);
		food = repository.save(food);
		return "redirect:/lesson02_10/complete";
	}

	@RequestMapping(path = "/lesson02_10/update/{id}", method = RequestMethod.GET)
	public String updateFood(@PathVariable Integer id, Model model) {
		Food food = new Food();
		food = repository.getReferenceById(id);
		FoodBean foodBean = new FoodBean();
		BeanUtils.copyProperties(food, foodBean);
		model.addAttribute("food", foodBean);
		return "lesson02_10/update_input";
	}

	@RequestMapping(path = "/lesson02_10/update/{id}", method = RequestMethod.POST)
	public String doUpdateFood(FoodForm form) {
		Food food = new Food();
		BeanUtils.copyProperties(form, food);
		food = repository.save(food);
		return "redirect:/lesson02_10/complete";
	}

	@RequestMapping(path = "/lesson02_10/delete/{id}")
	public String doDeleteFood(@PathVariable Integer id) {
		repository.deleteById(id);
		return "redirect:/lesson02_10/complete";
	}

}
