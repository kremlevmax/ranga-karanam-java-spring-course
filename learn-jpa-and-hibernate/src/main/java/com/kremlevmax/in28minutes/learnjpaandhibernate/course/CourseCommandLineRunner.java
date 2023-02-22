package com.kremlevmax.in28minutes.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.kremlevmax.in28minutes.learnjpaandhibernate.course.Course;
import com.kremlevmax.in28minutes.learnjpaandhibernate.course.jdbc.CourseJDBCTemplate;
import com.kremlevmax.in28minutes.learnjpaandhibernate.course.jpa.CourseJPATemplate;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	CourseJPATemplate courseJPATemplate;
	
	@Override
	public void run(String... args) throws Exception {
		courseJPATemplate.insertData(new Course(1, "Learn AWS!", "in28minutes"));
		courseJPATemplate.insertData(new Course(2, "Learn Java!", "in28minutes"));
		courseJPATemplate.insertData(new Course(3, "Learn Python!", "in28minutes"));
		courseJPATemplate.deleteData(3);
		System.out.println(courseJPATemplate.getDataById(1));
	}

}
