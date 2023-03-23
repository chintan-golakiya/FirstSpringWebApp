package com.chintan.FirstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
	
	@RequestMapping("alienhome")
	public ModelAndView alienhome(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("alien");
		return mv;
	}
}
