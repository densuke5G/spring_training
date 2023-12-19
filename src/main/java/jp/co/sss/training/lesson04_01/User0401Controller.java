package jp.co.sss.training.lesson04_01;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0401Controller {

	@Autowired
	TrainingUserRepository repository;
	@Autowired
	EntityManager entityManager;

	@RequestMapping(path = "/lesson04_01/index")
	public String result(Model model) {
		model.addAttribute("TrainingUsers", repository.findAll());
		
		return "lesson04_01/index";
	}

	@RequestMapping(path = "/lesson04_01/searchName", method = RequestMethod.GET)
	public String searchName(String keyword, Model model) {
		if (keyword != null && keyword.length() > 0) {
            keyword = "%" + keyword + "%";
        } else {
            keyword = "%";
        }
		Query query = entityManager.createNamedQuery("findByNameLike");
		query.setParameter("keyword", keyword);
		model.addAttribute("TrainingUsers", query.getResultList());
		return "lesson04_01/index";
	}

}
