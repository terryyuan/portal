package com.zsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView showIndex(){
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}
