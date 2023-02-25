package com.kremlevmax.myfirstspringwebapplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todoList = new ArrayList<>();
	
	static {
		todoList.add(new Todo(1, "in28minutes", "learn AWS", LocalDate.now().plusMonths(1l), false));
		todoList.add(new Todo(1, "in28minutes", "learn AWS", LocalDate.now().plusMonths(1l), false));
	}
	
	public List<Todo> findTodosByUsername(String username) {
		return todoList;
		
	}
}
