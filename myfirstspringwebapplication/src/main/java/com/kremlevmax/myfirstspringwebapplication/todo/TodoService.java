package com.kremlevmax.myfirstspringwebapplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todoList = new ArrayList<>();
	private static int idCounter = 2;

	
	static {
		todoList.add(new Todo(1, "in28minutes", "learn AWS", LocalDate.now().plusMonths(1l), false));
		todoList.add(new Todo(2, "in28minutes", "learn Java", LocalDate.now().plusMonths(1l), false));
	}
	
	public List<Todo> findTodosByUsername(String username) {
		return todoList;
		
	}
	
	public void addToDo(String author, String description, LocalDate date) {
		Todo todo = new Todo(++idCounter, author, description, date, false);
		todoList.add(todo);
	}
	
	public void removeTodo(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todoList.removeIf(predicate);
	}
	
	
	public Todo getTodoById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todoList.stream().filter(predicate).findFirst().get();
		return todo;
	}


	public void updateTodo(int id, @Valid Todo updatedTodo) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todoList.stream().filter(predicate).findFirst().get();
		
		todo.setDescription(updatedTodo.getDescription());
		todo.setDueDate(updatedTodo.getDueDate());
	}
}
