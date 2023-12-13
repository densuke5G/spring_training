package jp.co.sss.training.lesson02_08;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.bean.Userbean;
import jp.co.sss.training.entity.TrainingUser;
import jp.co.sss.training.form.UserForm;
import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0208Controller {

	@Autowired
	TrainingUserRepository repository;

	@RequestMapping(path = "/lesson02_08/new", method = RequestMethod.GET)
	public String newPage() {
		return "lesson02_08/new";
	}
	@RequestMapping(path = "/lesson02_08/new", method = RequestMethod.POST)
	public String createUser(UserForm form, Model model) {
		TrainingUser user = new TrainingUser();
		BeanUtils.copyProperties(form, user);
		user = repository.save(user);
		Userbean userbean = new Userbean();
		BeanUtils.copyProperties(user, userbean);
		model.addAttribute("user", userbean);
		
		return "lesson02_08/show";
	}

}
