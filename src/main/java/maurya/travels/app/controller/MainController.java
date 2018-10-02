package maurya.travels.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/about")
	public ModelAndView about(ModelAndView mv) {
		mv.setViewName("about");
		return mv;
	}

	@RequestMapping("/contactUs")
	public ModelAndView contactUs(ModelAndView mv) {
		mv.setViewName("contactUs");
		return mv;
	}

}