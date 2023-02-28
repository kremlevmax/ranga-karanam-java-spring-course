package com.kremlevmax.myfirstspringwebapplication.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
		String username = getUsername();
		List<Todo> todos = todoService.findTodosByUsername(username);
		model.addAttribute("todos", todos);
		model.addAttribute("username", username);
		return "todos";
	}
	
	@GetMapping("/add-todo")
	public String goAddTodoPage(ModelMap model) {
		String username = getUsername();
		Todo todo = new Todo(1, username, "", LocalDate.now(), false);
		model.put("todo", todo);
		return "add-todo";
	}
	
	@PostMapping("/add-todo")
	public String createTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "add-todo";
		}
		
		String username = getUsername();
		todoService.addToDo(username, todo.getDescription(), todo.getDueDate());
		return "redirect:todos";	
	}
	
	@GetMapping("/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.removeTodo(id);
		return "redirect:todos";	
	}
	
	@GetMapping("/update-todo")
	public String showUpdateTodoForm(ModelMap model, @RequestParam int id) {
		Todo todo = todoService.getTodoById(id);
		model.addAttribute("todo", todo);
		return "add-todo";
	}
	
	@PostMapping("/update-todo")
	public String updateTodo(@RequestParam int id, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "add-todo";
		}
		todoService.updateTodo(id, todo);
		return "redirect:todos";	
	}
	
	private String getUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
