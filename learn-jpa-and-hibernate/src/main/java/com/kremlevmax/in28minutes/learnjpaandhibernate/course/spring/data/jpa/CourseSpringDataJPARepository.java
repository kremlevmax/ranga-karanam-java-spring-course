package com.kremlevmax.in28minutes.learnjpaandhibernate.course.spring.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kremlevmax.in28minutes.learnjpaandhibernate.course.Course;

@Repository
public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long>{

}
