package maurya.travels.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class BlogController {
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView allBlogs(ModelAndView mv) {
		mv.setViewName("blog");
		System.out.println("all blog");
		return mv;
	}

	@RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
	public ModelAndView blogById(@PathVariable("id") String blogId, ModelAndView mv) {
		mv.setViewName("blog");
		System.out.println("blog by id " + blogId);
		return mv;
	}

	@RequestMapping(value = "/blog", method = RequestMethod.POST)
	public ModelAndView addBlog(ModelAndView mv) {
		mv.setViewName("blog");
		System.out.println("add blog");
		return mv;
	}

	@RequestMapping(value = "/blog", method = RequestMethod.PUT)
	public ModelAndView updateBlog(ModelAndView mv) {
		mv.setViewName("blog");
		System.out.println("update blog");
		return mv;
	}

	@RequestMapping(value = "/blog", method = RequestMethod.DELETE)
	public ModelAndView deleteBlog(ModelAndView mv) {
		mv.setViewName("blog");
		System.out.println("delete blog");
		return mv;
	}

}
