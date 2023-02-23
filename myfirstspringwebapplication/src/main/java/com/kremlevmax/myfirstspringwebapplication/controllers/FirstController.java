package com.kremlevmax.myfirstspringwebapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("/first-controller")
	@ResponseBody
	public String firstController() {
		return "Hello World";
	}
	
	@RequestMapping("hello-jsp")
	public String helloJsp() {
		return "hello";
	}

}
