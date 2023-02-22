package com.kremlevmax.in28minutes.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.kremlevmax.in28minutes.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPATemplate {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insertData(Course course) {
		entityManager.merge(course);
	}
	
	public Course getDataById(int id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteData(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);

	}
}
