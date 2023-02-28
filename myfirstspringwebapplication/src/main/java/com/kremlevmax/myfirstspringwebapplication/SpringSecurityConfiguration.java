package com.kremlevmax.myfirstspringwebapplication;

import java.util.function.Function;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
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
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		
		return http.build();
	}
}
