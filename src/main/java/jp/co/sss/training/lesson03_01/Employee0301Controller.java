package jp.co.sss.training.lesson03_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.repository.EmployeeRepository;

@Controller
public class Employee0301Controller {
	
	@Autowired
	EmployeeRepository repository;
	
	@RequestMapping("/lesson03_01/index")
	public String findAll(Model model) {
		model.addAttribute("employees", repository.findAll());
		return "lesson03_01/index";
	}
}
