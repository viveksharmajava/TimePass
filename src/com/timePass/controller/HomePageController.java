package com.timePass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomePageController {

	@RequestMapping("/home.do")
	public ModelAndView homePage(){
		System.out.println(" inside HomePageController");
		ModelAndView model = new ModelAndView("user/home");
		return model;
	}
}
