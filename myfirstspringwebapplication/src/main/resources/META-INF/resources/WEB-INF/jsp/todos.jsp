<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Login Page</title>
	</head>
	<body>
		<div class="container">
			<h1>Welcome, ${login}</h1>
			<hr>
			
			<h2>Todo List:</h2>
			
			<table class="table table-striped"">
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Due Date</th>
					<th>Complete</th>
					<th></th>
				</tr>
				
				<c:forEach items = "${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.dueDate}</td>
						<td>${todo.isDone}</td>
						<td><a href="/delete-todo?id=${todo.id}" class="btn btn-warning">Remove</a></td>
					</tr>
				</c:forEach>
			</table>
			<a href="/add-todo" class="btn btn-success">Add a new Todo</a>
		</div>
		
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>