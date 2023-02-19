package com.kremlevmax.GameApp.business.calculation.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainApp {
	public static void main(String[] args) {
		try(
				var context = new AnnotationConfigApplicationContext(MainApp.class);
		){
			System.out.println(context.getBean(BusinessCalculationServices.class).findMax());
		}
	}
}
