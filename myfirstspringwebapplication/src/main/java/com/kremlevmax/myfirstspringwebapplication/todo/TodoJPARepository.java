package com.kremlevmax.myfirstspringwebapplication.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJPARepository extends JpaRepository<Todo, Integer>{
	public List<Todo> findByUsername(String username);

}
