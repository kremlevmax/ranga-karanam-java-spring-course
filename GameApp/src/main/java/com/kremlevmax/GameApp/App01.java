package com.kremlevmax.GameApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01 {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("person"));
		context.close();
	}

}
