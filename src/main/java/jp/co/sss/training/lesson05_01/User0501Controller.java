package jp.co.sss.training.lesson05_01;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.User0501Form;
import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0501Controller {

	@Autowired
	TrainingUserRepository repository;

	@RequestMapping(path = "/lesson05_01/result")
	public String result() {
		return "lesson05_01/result";
	}

	@RequestMapping(path = "/lesson05_01/new", method = RequestMethod.GET)
	public String newPage(@ModelAttribute User0501Form form) {
		return "lesson05_01/new";
	}

	@RequestMapping(path = "/lesson05_01/new", method = RequestMethod.POST)
	public String doNew(@Valid @ModelAttribute User0501Form form, BindingResult result, Model model) {
		if (result.hasErrors()) {
			for (ObjectError err : result.getAllErrors()) {
				model.addAttribute("formError", err.getDefaultMessage());
			}
			return "lesson05_01/new";

		} else {
			return "redirect:/lesson05_01/result";

		}

	}

}
