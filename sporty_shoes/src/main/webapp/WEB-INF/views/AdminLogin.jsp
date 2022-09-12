<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
</head>
<body style="background-color: powderblue">
	<br>
	<a href=index.jsp
		style="color: black; text-decoration: none; font-size: 35px; font-weight: bold"><center>Sporty
			Shoes--An-E commerce Website</center></a>
	<br>
	<br>

	<center>
		<h2 style="color: blue">Admin Login</h2>
	</center>
	<center>
		<div style="border: 3px solid black; width: 25%; padding: 20px">
			<form action=adminscreen method=post>
				<label for=email>Email :-</label> <input type="email" name=email
					id=email /><br>
				<br> <label for=pass>Password :-</label> <input type="password"
					name=password id=pass /><br>
				<br> <input type=submit value=submit /> <input type=reset />
			</form>
		</div>
	</center>
	<br>
	<a href=forgotPassword style="font-size: 25; color: red">Forgot
		Password</a>


	<p style="color: red">${message}</p>

</body>
</html>