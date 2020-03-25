package com.niit.demo.springmvc.controller;

import java.lang.annotation.Retention;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//return model+view name
	@RequestMapping(value = "/shHome",method = RequestMethod.GET)
	public String showHome(ModelMap model) {
		model.addAttribute("user", "moksh");
		model.addAttribute("d", new java.util.Date());
		return "home";
	}
	
	@RequestMapping(value="/hello")
	public String showSecond() {
		return "second";
	}
}
