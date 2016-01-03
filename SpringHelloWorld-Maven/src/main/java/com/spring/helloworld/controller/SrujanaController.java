package com.spring.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SrujanaController {
	@RequestMapping("/srujana")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Srujana's page!");
		return "srujana_home";
	}
}

/*A model object is built, and the attributes are added with their values.
The flow now goes to the page srujana (the full path is obtained from the
servlet.xml)*/

/* Full path (as identified by spring)= /WEB-INF/jsp/ + srujana + .jsp */