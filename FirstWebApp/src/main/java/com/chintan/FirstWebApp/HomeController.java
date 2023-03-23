package com.chintan.FirstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = req.getParameter("username");
		System.out.println("HomeController.home function...");
		System.out.println("name input "+name);
		session.setAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("home1")
	public String home1(@RequestParam("username") String name, HttpSession session) {
		session.setAttribute("name", name + "1");
		return "home";
	}
	
	@RequestMapping("homedata")
	public ModelAndView homedata(@RequestParam("username")String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","user " +name);
		mv.setViewName("home");
		return mv;
	}
}
