package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.NameResponse;
import co.grandcircus.famouslab.model.Tinyint;

@Controller
public class FamousController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView famous() {

		NameResponse response = apiService.getList();
		ModelAndView mv = new ModelAndView("tinyint");
		List<Tinyint> tiny = response.getTiny();
		mv.addObject("tinyint", tiny);
		return mv;
	}

	@RequestMapping("/complete")
	public ModelAndView complete() {

		NameResponse response = apiService.getList();
		ModelAndView mv = new ModelAndView("complete");
		mv.addObject("complete", response.getComplete());
		return mv;
	}
}
