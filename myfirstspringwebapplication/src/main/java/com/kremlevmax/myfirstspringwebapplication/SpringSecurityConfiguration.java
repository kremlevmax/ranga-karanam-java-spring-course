package com.kremlevmax.myfirstspringwebapplication;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.SessionAttributes;

@Configuration
@SessionAttributes("username")
public class SpringSecurityConfiguration {
	
	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		Function<String, String> bcryptPasswordEncoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails = User.builder()
										.passwordEncoder(bcryptPasswordEncoder)
										.username("Max")
										.password("12345")
										.roles("Admin")
										.build();
		return new InMemoryUserDetailsManager(userDetails);		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
