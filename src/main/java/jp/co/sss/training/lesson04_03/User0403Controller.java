package jp.co.sss.training.lesson04_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0403Controller {

	@Autowired
	TrainingUserRepository repository;
	

	@RequestMapping(path = "/lesson04_03/index")
	public String result(Model model) {
		model.addAttribute("TrainingUsers", repository.findAll());
		
		return "lesson04_03/index";
	}

	@RequestMapping(path = "/lesson04_03/searchName", method = RequestMethod.GET)
	public String searchName(String keyword, Model model) {
		if (keyword != null && keyword.length() > 0) {
            keyword = "%" + keyword + "%";
        } else {
            keyword = "%";
        }
		model.addAttribute("count", repository.findByCountQuery(keyword));
		model.addAttribute("TrainingUsers", repository.findByQuery(keyword));
		return "lesson04_03/index";
	}

}
