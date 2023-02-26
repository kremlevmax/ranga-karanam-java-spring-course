package com.kremlevmax.myfirstspringwebapplication.controllers.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kremlevmax.myfirstspringwebapplication.todo.TodoService;

@Controller
@SessionAttributes("login")
public class LoginController {
	private AuthenticationService authenticationService;
	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@GetMapping("/login")
	public String goToLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String goToWelcomePage(@RequestParam String login, @RequestParam String password, ModelMap model) {
		if (authenticationService.verifyCredentials(login, password)) {
			logger.info(login + " logged in");
			model.addAttribute("login", login);
			return "welcome";
		} else {
			model.addAttribute("error", "Wrong username or password");
			return "login";
		}
	}
}
