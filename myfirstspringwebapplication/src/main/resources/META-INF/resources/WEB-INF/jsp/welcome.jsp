<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>	
<title>Welcome</title>		
</head>
<body>
	<div class="container">
		<h1>Welcome ${username}</h1>
		<a href="/todos">Manage</a> your todos
	</div>
<%@ include file="common/footer.jspf" %>