package com.aplause.chesslog.controllers;

import com.aplause.chesslog.model.User;
import com.aplause.chesslog.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Autowired
	AuthenticationService authenticationService;

	@RequestMapping("/")
	String index() {
		return "index";
	}

	@ModelAttribute("test")
	public String getTest() {
		return "Hello from Test";
	}

	@ModelAttribute("user")
	public User getLoggedUser() {
		return authenticationService.getUserById(1L);
	}
}
