<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<title>Add Todo Entry</title>		
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
					<form:input type="text" path="dueDate" name="dueDate" id="dueDate"/><br/>
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
<%@ include file="common/footer.jspf" %>
		
<script type="text/javascript">
	$('#dueDate').datepicker({
	    startDate: '+0d'

	});
</script>
