package com.kremlevmax.myfirstspringwebapplication.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("username")
public class TodoController {
	TodoService todoService;
	
	@Autowired
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("/todos")
	public String showTodos(ModelMap model) {
		List<Todo> todos = todoService.findTodosByUsername("username");
		model.addAttribute("todos", todos);
		return "todos";
	}
	
	@GetMapping("/add-todo")
	public String goAddTodoPage(ModelMap model) {
		String username = (String)model.get("username");
		Todo todo = new Todo(0, username, "", LocalDate.now(), false);
		model.put("todo", todo);
		return "add-todo";
	}
	
	@PostMapping("/add-todo")
	public String createTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		String authorString = (String) model.get("username");
		todoService.addToDo(authorString, todo.getDescription(), todo.getDueDate());
		return "redirect:todos";
	}
	
	@GetMapping("/delete-todo")
	public String  deleteTodo(@RequestParam int id) {
		todoService.removeTodo(id);
		return "redirect:todos";	
	}
}
