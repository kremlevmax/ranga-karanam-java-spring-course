package com.kremlevmax.myfirstspringwebapplication.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("login")
public class TodoController {
	TodoService todoService;
	
	@Autowired
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("/todos")
	public String showTodos(ModelMap model) {
		List<Todo> todos = todoService.findTodosByUsername("login");
		model.addAttribute("todos", todos);
		return "todos";
	}

}
