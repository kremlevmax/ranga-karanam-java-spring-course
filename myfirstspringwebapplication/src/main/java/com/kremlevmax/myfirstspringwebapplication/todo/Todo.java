package com.kremlevmax.myfirstspringwebapplication.todo;

import java.time.LocalDate;

public class Todo {
	private int id;
	private String username;
	private String description;
	private LocalDate dueDate;
	private boolean isDone;
	
	public Todo(int id, String username, String description, LocalDate dueDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.dueDate = dueDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", dueDate=" + dueDate
				+ ", isDone=" + isDone + "]";
	}
	
	
}