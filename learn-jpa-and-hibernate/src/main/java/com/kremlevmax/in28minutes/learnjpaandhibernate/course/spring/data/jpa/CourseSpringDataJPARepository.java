package com.kremlevmax.in28minutes.learnjpaandhibernate.course.spring.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kremlevmax.in28minutes.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long>{

}
