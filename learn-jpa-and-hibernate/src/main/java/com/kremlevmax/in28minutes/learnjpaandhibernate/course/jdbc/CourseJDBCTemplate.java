package com.kremlevmax.in28minutes.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kremlevmax.in28minutes.learnjpaandhibernate.course.Course;

@Repository
public class CourseJDBCTemplate {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String insertSqlQuery =  
			"""
			INSERT INTO course (id, name, author)
			VALUES(?, ?, ?)
			""";
	
	private String deleteSqlQueryString = 
			"""
			DELETE FROM course
			WHERE id=?;
			""";
	
	private String getByIdQueryString = 
			"""
			SELECT * FROM course WHERE id = ?;
			""";
	
	public void insertData(Course course) {
		jdbcTemplate.update(insertSqlQuery, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteData(int id) {
		jdbcTemplate.update(deleteSqlQueryString, id);
	}
	
	public Course getDataById(int id) {
		return jdbcTemplate.queryForObject(getByIdQueryString, new BeanPropertyRowMapper<>(Course.class), id);
	}

}
