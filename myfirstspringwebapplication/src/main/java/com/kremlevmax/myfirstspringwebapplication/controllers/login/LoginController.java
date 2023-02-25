package com.kremlevmax.myfirstspringwebapplication.controllers.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kremlevmax.myfirstspringwebapplication.todo.TodoService;

@Controller
public class LoginController {
	private AuthenticationService authenticationService;
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping("/login")
	public String goToLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String login, @RequestParam String password, ModelMap model) {
		if (authenticationService.verifyCredentials(login, password)) {
			logger.info(login + " logged in");
			model.addAttribute("login", login);
			return "welcome";
		} else {
			return "login";
		}
	}
}
