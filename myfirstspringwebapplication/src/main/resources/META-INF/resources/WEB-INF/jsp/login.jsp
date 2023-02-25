<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Login Page</title>
	</head>
	<body>
		<div class="container">
				<form method="post">
				
					<div class="form-group">
						<label for="login">Login:</label><br>
						<input type="text" id="login" name="login" class="form-control" placeholder="Username">
					</div>
					
					<div class="form-group">
						<label for="password">Password:</label><br>
						<input type="password" id="password" name="password" class="form-control" placeholder="Password">
					</div>
					<div class="form-group">
						<input type="submit" value="Log In" class="btn btn-primary">
					</div>
			</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>