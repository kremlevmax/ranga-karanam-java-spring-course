package com.kremlevmax.in28minutes.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.kremlevmax.in28minutes.learnjpaandhibernate.course.Course;
import com.kremlevmax.in28minutes.learnjpaandhibernate.course.jdbc.CourseJDBCTemplate;
import com.kremlevmax.in28minutes.learnjpaandhibernate.course.jpa.CourseJPATemplate;
import com.kremlevmax.in28minutes.learnjpaandhibernate.course.spring.data.jpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	CourseSpringDataJPARepository courseSpringDataJPARepository;
	
	public void run(String... args) throws Exception {
		courseSpringDataJPARepository.save(new Course(1, "Learn AWS!", "in28minutes"));
		courseSpringDataJPARepository.save(new Course(2, "Learn Java!", "in28minutes"));
		courseSpringDataJPARepository.save(new Course(3, "Learn Python!", "in28minutes"));
		courseSpringDataJPARepository.deleteById(3l);
		System.out.println(courseSpringDataJPARepository.findById(1l));

	}

}
