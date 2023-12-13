package jp.co.sss.training.lesson02_03;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.bean.Userbean;
import jp.co.sss.training.entity.TrainingUser;
import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0203Controller {

	@Autowired
	TrainingUserRepository repository;

	@RequestMapping("/lesson02_03/index")
	public String findAll(Model model) {
		model.addAttribute("TrainingUsers", repository.findAll());
		return "lesson02_03/index";
	}

	@RequestMapping("/lesson02_03/show/{id}")
	public String showUser(@PathVariable Integer id, Model model) {
		TrainingUser trainingUser = repository.getReferenceById(id);
		Userbean userbean = new Userbean();
		BeanUtils.copyProperties(trainingUser, userbean);
		model.addAttribute("TrainingUser", userbean);
		return "lesson02_03/show";
	}
}
