package com.kremlevmax.GameApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class AppConfiguration {
	
	@Bean
	public String name() {
		return "Max";
	}
	
	@Bean
	public Person person() {
		return new Person("Max", 23);
	}
}
