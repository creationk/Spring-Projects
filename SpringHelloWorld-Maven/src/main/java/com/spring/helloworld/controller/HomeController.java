package com.spring.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Hello World!!");
		model.addAttribute("tagline", "This took a lot of time to build!");
		return "welcome";
	}
}
