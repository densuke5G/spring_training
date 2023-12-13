package jp.co.sss.training.lesson02_06;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.entity.TrainingUser;
import jp.co.sss.training.form.LoginForm;
import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class Login0206Controller {

	@Autowired
	TrainingUserRepository repository;
	
	@RequestMapping(path = "/lesson02_06/login")
	public String login() {
		return "lesson02_06/login";
	}
	@RequestMapping(path = "/lesson02_06/doLogin", method = RequestMethod.POST)
	public String doLogin(LoginForm form, HttpSession session) {
		TrainingUser trainingUser = new TrainingUser();
		trainingUser = repository.findByUserIdAndPassword(form.getUserId(), form.getPassword());
		if (trainingUser != null) {
			session.setAttribute("userId", form.getUserId());
			return "lesson02_06/top";
		} else {
			return "lesson02_06/login";
			
		}
	}
}
