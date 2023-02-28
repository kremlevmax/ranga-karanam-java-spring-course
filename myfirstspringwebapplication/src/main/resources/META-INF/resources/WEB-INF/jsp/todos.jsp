<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<title>Todo List</title>		
</head>
	<body>
		<div class="container">
			<h1>Welcome, ${username}</h1>
			<hr>
			
			<h2>Todo List:</h2>
			
			<table class="table table-striped"">
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Due Date</th>
					<th>Complete</th>
					<th></th>
					<th></th>
				</tr>
				
				<c:forEach items = "${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.dueDate}</td>
						<td>${todo.isDone}</td>
						<td><a href="/delete-todo?id=${todo.id}" class="btn btn-warning">Remove</a></td>
						<td><a href="/update-todo?id=${todo.id}" class="btn btn-info">Update</a></td>
					</tr>
				</c:forEach>
			</table>
			<a href="/add-todo" class="btn btn-success">Add a new Todo</a>
		</div>
<%@ include file="common/footer.jspf" %>