package com.kremlevmax.myfirstspringwebapplication.controllers.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@GetMapping("/")
	public String goToLoginPage(ModelMap model) {
		model.addAttribute("username", getUsername());
		return "welcome";
	}
	
	private String getUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();	
	}
}


