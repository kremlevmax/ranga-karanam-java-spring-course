<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<meta charset="UTF-8">
		<title>Add new Todo</title>
	</head>
	<body>
		<div class="container">
			<h2>Add new todo</h2>
			<form:form method="post" modelAttribute="todo">
				<div class="form-group">
					<label for="description">Description:</label><br>
					<form:input type="text" path="description" name="description" placeholder="Description"/><br/>
					<form:errors path="description" cssClass="text-warning"/>
				</div>
				<div class="form-group">
					<label for="dueDate">Due Date:</label><br>
					<form:input type="date" path="dueDate" name="dueDate"/><br/>
					<form:errors path="dueDate" cssClass="text-warning"/>
				</div>
				<span class="error">${error}</span>
				<div class="form-group">
					<input type="submit" value="Save" class="btn btn-success"/>
				</div>
				<form:input type="hidden" path="id" name="id"/>
				<form:input type="hidden" path="isDone" name="isDone"/>			
			</form:form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>