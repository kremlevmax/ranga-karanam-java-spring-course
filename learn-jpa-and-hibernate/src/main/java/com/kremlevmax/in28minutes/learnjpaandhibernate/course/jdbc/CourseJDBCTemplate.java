package com.kremlevmax.in28minutes.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCTemplate {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String sqlQueryString =  
			"""
			INSERT INTO course (id, name, author)
			VALUES(1, 'LEARN AWS', 'in28minutes')
			""";
	
	public void insetData() {
		jdbcTemplate.update(sqlQueryString);
	}

}
