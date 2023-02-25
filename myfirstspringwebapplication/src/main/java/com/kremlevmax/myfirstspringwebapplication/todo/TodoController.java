package com.kremlevmax.myfirstspringwebapplication.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class TodoController {
	TodoService todoService;
	
	@Autowired
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("/todos")
	public String showTodos() {
		return "todos";
	}

}
