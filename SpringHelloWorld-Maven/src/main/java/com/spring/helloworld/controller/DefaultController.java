package com.spring.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("private_link", "http://localhost:8080/helloworld/srujana.private");
		model.addAttribute("public_link", "http://localhost:8080/helloworld/srujana.public");
		return "index";
	}
}
