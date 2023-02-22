package com.kremlevmax.in28minutes.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

	@Autowired
	CourseJDBCTemplate courseJDBCTemplate;
	
	@Override
	public void run(String... args) throws Exception {
		courseJDBCTemplate.insetData();
	}

}
