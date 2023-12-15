package jp.co.sss.training.lesson03_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.entity.Department;
import jp.co.sss.training.repository.EmployeeRepository;

@Controller
public class Employee0302Controller {
	
	@Autowired
	EmployeeRepository repository;
	
	@RequestMapping("/lesson03_02/index")
	public String findAll(Model model) {
		model.addAttribute("employees", repository.findAll());
		return "lesson03_02/index";
	}
	
	@RequestMapping("/lesson03_02/index/{departmentId}")
	public String findAll(@PathVariable Integer departmentId, Model model) {
		Department department = new Department();
		department.setId(departmentId);
		model.addAttribute("employees", repository.findByDepartment(department));
		return "lesson03_02/index";
	}
}
